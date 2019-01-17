package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.domain.Faculty;
import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.FacultyService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FACULTY CONTROLLER
 */
@Controller
@RequestMapping(value = "/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    private final Logger logger;


    @Autowired
    FacultyController(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger) {
        this.logger = logger;
    }

    /**
     * Faculty Registration
     * @param faculty
     * @return HttpStatus
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity registerFaculty(@RequestBody Faculty faculty) {
        try {
            facultyService.createFaculty(faculty);
        } catch (Exception e) {
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
