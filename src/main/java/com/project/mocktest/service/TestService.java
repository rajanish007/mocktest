package com.project.mocktest.service;

import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.domain.Result;
import com.project.mocktest.domain.Test;
import com.project.mocktest.domain.TestVO;
import com.project.mocktest.repository.QuestionRepository;
import com.project.mocktest.repository.ResultRepository;
import com.project.mocktest.repository.TestEntity;
import com.project.mocktest.repository.TestRepository;
import com.project.mocktest.service.mapper.TestMapper;
import com.project.mocktest.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ResultRepository resultRepository;

    public TestVO createNewTest(long studentId, List<QuestionVO> questionVOS) {
        Test test = new Test();
        test.setTestDuration(Utilities.addList(questionVOS));
        test.setTestDate(new Date());
        test.setQuestionList(Utilities.listToString(questionVOS));
        test.setStudentId(studentId);
        TestEntity savedEntity = testRepository.save(testMapper.convert(test));
        return testMapper.convertToVO(testMapper.convert(savedEntity));
    }

    public void createNewTestResult(Result result) {
        resultRepository.save(testMapper.convert(result));
    }

    public Result getTestResult(String testId) {
        return testMapper.convert(resultRepository.findByTestId(testId));
    }

}
