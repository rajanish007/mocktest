package com.project.mocktest.controller;

import com.project.mocktest.constant.MockConstants;
import com.project.mocktest.handlers.AnubisException;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OffController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        return String.format("<html><body><h2>Error Page</h2><div>Status code: <b>%s</b></div>"
                        + "<div>Exception Message: <b>%s</b></div><body></html>",
                statusCode, exception==null? "N/A": exception.getMessage());
    }

    @RequestMapping(value = "/identifier_missing")
    public void identifierMissingErrorHandler()throws AnubisException {
        throw new AnubisException(HttpStatus.FORBIDDEN);
    }

    @RequestMapping(value = "/identifier_wrong")
    public void identifierIncorrctErrorHandler() throws AnubisException {
        throw new AnubisException(HttpStatus.BAD_REQUEST);
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}