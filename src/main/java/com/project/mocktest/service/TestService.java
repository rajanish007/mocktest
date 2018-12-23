package com.project.mocktest.service;

import com.project.mocktest.domain.*;
import com.project.mocktest.repository.*;
import com.project.mocktest.service.mapper.TestMapper;
import com.project.mocktest.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private StudentService studentService;

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

    public List<Result> getToppersResult() {
        List<ResultEntity> topperResults = resultRepository.findByTopper();
        List<Result> results = new ArrayList();
        for (ResultEntity rEntity : topperResults) {
            results.add(testMapper.convert(rEntity));
        }
        return results;
    }

    public List<Student> getToppers(List<Result> results) {
        List<Student> toppers = studentService.findStudentsByIdsFromResult(results);
        return toppers;
    }

    public List<Result> getAllResults(){
        List<ResultEntity> resultEntities = resultRepository.findAll();
        List<Result> results = new ArrayList<>();
        for(ResultEntity resultEntity : resultEntities){
            results.add(testMapper.convert(resultEntity));
        }
        return results;
    }

}
