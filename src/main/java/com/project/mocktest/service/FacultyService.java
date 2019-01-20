package com.project.mocktest.service;

import com.project.mocktest.domain.Faculty;
import com.project.mocktest.domain.FacultyVO;
import com.project.mocktest.repository.FacultyEntity;
import com.project.mocktest.repository.FacultyRepository;
import com.project.mocktest.service.mapper.FacultyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private FacultyMapper facultyMapper;

    /**
     * CREATE FACULTY
     *
     * @param faculty
     */
    public void createFaculty(Faculty faculty) {
        FacultyEntity facultyEntity = facultyMapper.convert(faculty);
        facultyRepository.save(facultyEntity);
    }

    /**
     * GET FACULTY
     *
     * @param userName
     * @return
     */
    public FacultyVO getFaculty(String userName) {
        FacultyEntity facultyEntity = facultyRepository.findUserByfacultyUserName(userName);
        FacultyVO facultyVO = facultyMapper.convertToVO(facultyEntity);
        return facultyVO;
    }
}
