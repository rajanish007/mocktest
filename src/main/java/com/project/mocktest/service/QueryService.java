package com.project.mocktest.service;

import com.project.mocktest.domain.Question;
import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.repository.FacultyRepository;
import com.project.mocktest.repository.QuestionEntity;
import com.project.mocktest.repository.QuestionRepository;
import com.project.mocktest.service.mapper.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryService {

    @Autowired
    private QueryMapper queryMapper;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private FacultyRepository facultyRepository;

    public void createQuery(Question q) {
        QuestionEntity qEntity = queryMapper.convert(q);
        questionRepository.save(qEntity);
    }

    public List<QuestionVO> getForFaculty(String facultyName) {
        List<QuestionEntity> questionEntities = questionRepository.findByFacultyId(facultyRepository.findFacultyIdFromName(facultyName));
        List<QuestionVO> questionVOS = new ArrayList();
        for (QuestionEntity qEntity : questionEntities) {
            questionVOS.add(queryMapper.convertToVO(qEntity));
        }
        return questionVOS;
    }

}
