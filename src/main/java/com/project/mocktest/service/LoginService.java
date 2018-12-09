package com.project.mocktest.service;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.repository.FacultyEntity;
import com.project.mocktest.repository.FacultyRepository;
import com.project.mocktest.repository.StudentEntity;
import com.project.mocktest.repository.StudentRepository;
import com.project.mocktest.utils.Utilities;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    FacultyRepository facultyRepository;

    private static Logger logger;

    @Autowired
    LoginService(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger) {
        this.logger = logger;
    }

    public boolean userAuthenticated(String username, String password, boolean isFaculty) {
        if (isFaculty) {
            FacultyEntity pFaculty = facultyRepository.findUserByUsernameAndPassword(username, Utilities.Bas64encode(password));
            if (pFaculty == null) return false;
        } else {
            StudentEntity pStudent = studentRepository.findUserByUsernameAndPassword(username, Utilities.Bas64encode(password));
            if (pStudent == null) return false;
        }
        return true;
    }
}
