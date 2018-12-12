package com.project.mocktest.service.mapper;

import com.project.mocktest.domain.Result;
import com.project.mocktest.domain.Test;
import com.project.mocktest.domain.TestVO;
import com.project.mocktest.repository.ResultEntity;
import com.project.mocktest.repository.TestEntity;
import com.project.mocktest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestMapper {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private TestMapper testMapper;

    public TestEntity convert(Test test) {
        return new TestEntity(test.getStudentId(), test.getTestDate(),
                test.getQuestionList(), test.getTestDuration());
    }

    public Test convert(TestEntity testEntity) {
        Test test = new Test();
        test.setStudentId(testEntity.getStudentId());
        test.setQuestionList(testEntity.getQuestionList());
        test.setTestDate(testEntity.getTestDate());
        test.setTestDuration(testEntity.getTestDuration());
        test.setTestId(testEntity.getTestId());
        return test;
    }

    public TestVO convertToVO(Test test) {
        TestVO testVO = new TestVO();
        testVO.setQuestionList(test.getQuestionList());
        testVO.setStudentId(test.getStudentId());
        testVO.setTestDate(test.getTestDate());
        testVO.setTestDuration(test.getTestDuration());
        testVO.setTestId(test.getTestId());
        return testVO;
    }

    public ResultEntity convert(Result result) {
        return new ResultEntity(result.getTestId(), result.getStudentId(),
                result.getPercentage(), result.getStatus(), result.getFeedback());
    }

    public Result convert(ResultEntity resultEntity) {
        Result result = new Result();
        result.setFeedback(resultEntity.getFeedback());
        result.setPercentage(resultEntity.getPercentage());
        result.setResultId(resultEntity.getStudentId());
        result.setStatus(resultEntity.getStatus());
        result.setStudentId(resultEntity.getStudentId());
        result.setTestId(resultEntity.getTestId());
        return result;
    }

}
