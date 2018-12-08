package com.project.mocktest.controller;

import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.LoginService;
import com.project.mocktest.utils.Utilities;
import com.project.mocktest.constant.MockConstants;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    private Logger logger;

    @Autowired
    LoginController(@Qualifier(MockConstants.LOG_QUALIFIER) Logger logger) {
        this.logger = logger;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getLogin(final ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ResponseEntity postLogin(@RequestParam("username") String username,
                                    @RequestParam("password") String password,
                                    ModelMap map) {
        if (!loginService.userAuthenticated(username, Utilities.Base64decode(password))) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/new/student", method = RequestMethod.GET)
    public String registerStudent(final HttpServletRequest request,
                                  final HttpServletResponse response,
                                  final ModelMap model) {
        return "loginNew";
    }
}
