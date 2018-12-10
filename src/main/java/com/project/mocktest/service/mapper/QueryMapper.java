package com.project.mocktest.service.mapper;

import com.project.mocktest.domain.Question;
import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.repository.QuestionEntity;
import org.springframework.stereotype.Component;

@Component
public class QueryMapper {

    public Question convert(QuestionEntity qEntity) {
        Question q = new Question();
        q.setCorrectAnswer(qEntity.getCorrectAnswer());
        q.setDescription(qEntity.getDescription());
        q.setFaculty_Id(qEntity.getFaculty_Id());
        q.setFirstAnswer(qEntity.getFirstAnswer());
        q.setSecondAnswer(qEntity.getSecondAnswer());
        q.setThirdAnswer(qEntity.getThirdAnswer());
        q.setFourthAnswer(qEntity.getFourthAnswer());
        q.setTimeAllocated(qEntity.getTimeAllocated());
        q.setQuestionId(qEntity.getQuestionId());
        return q;
    }

    public QuestionEntity convert(Question q) {
        QuestionEntity questionEntity = new QuestionEntity(q.getFaculty_Id(),
                q.getTimeAllocated(), q.getCorrectAnswer(), q.getDescription(),
                q.getFirstAnswer(), q.getSecondAnswer(), q.getThirdAnswer(), q.getFourthAnswer());
        return questionEntity;
    }

    public QuestionVO convertToVO(QuestionEntity qEntity) {
        Question q = convert(qEntity);
        QuestionVO qVO = new QuestionVO();
        qVO.setCorrectAnswer(q.getCorrectAnswer());
        qVO.setDescription(q.getDescription());
        qVO.setFaculty_Id(q.getFaculty_Id());
        qVO.setFirstAnswer(q.getFirstAnswer());
        qVO.setSecondAnswer(q.getSecondAnswer());
        qVO.setThirdAnswer(q.getThirdAnswer());
        qVO.setFourthAnswer(q.getFourthAnswer());
        qVO.setTimeAllocated(q.getTimeAllocated());
        qVO.setQuestionId(q.getQuestionId());
        return qVO;
    }

}
