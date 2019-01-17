package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.service.LoginService;
import com.project.mocktest.utils.Utilities;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * LOGIN CONTROLLER
 */
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

    /**
     * Login Details Getter
     *
     * @param isFaculty
     * @param model
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getLogin(@RequestParam("isFaculty") boolean isFaculty, final ModelMap model) {
        return "login";
    }

    /**
     * Login Checker
     *
     * @param username
     * @param password
     * @param isFaculty
     * @param map
     * @return
     */
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ResponseEntity postLogin(@RequestParam("username") String username,
                                    @RequestParam("password") String password,
                                    @RequestParam("isFaculty") boolean isFaculty,
                                    ModelMap map) {
        if (!loginService.userAuthenticated(username, Utilities.Base64decode(password), isFaculty)) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * New User Register
     *
     * @param isFaculty
     * @param model
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String registerStudent(@RequestParam("isFaculty") boolean isFaculty,
                                  final ModelMap model) {
        if (isFaculty == false)
            return "login_new_stud";
        return "login_new_faculty";
    }
}
