package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.domain.Student;
import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.StudentService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final Logger logger;

    @Autowired
    StudentController(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger) {
        this.logger = logger;
    }

    /**
     * New Student Registration
     *
     * @param student
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity registerStudent(@RequestBody Student student) {
        try {
            studentService.createStudent(student);
        } catch (Exception e) {
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
