package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.domain.Student;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private Logger logger;

    @Autowired
    StudentController(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger){
        this.logger = logger;
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    public Integer registerStudent(@RequestBody Student student){
        logger.info(student.toString());
        return HttpServletResponse.SC_OK;
    }
}
