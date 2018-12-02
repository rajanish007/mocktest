package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    private Logger logger;

    @Autowired
    LoginController(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger){
        this.logger = logger;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String init(final HttpServletRequest request,
                        final HttpServletResponse response,
                        final ModelMap model){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final HttpServletRequest request,
                        final HttpServletResponse response,
                        final ModelMap model){
        return "login";
    }

    @RequestMapping(value = "/login/new/student", method = RequestMethod.GET)
    public String registerStudent(final HttpServletRequest request,
                        final HttpServletResponse response,
                        final ModelMap model){
        return "login_new";
    }
}
