package com.project.mocktest.handlers;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.SQLIntegrityConstraintViolationException;

public class AnubisException {

    private ResponseEntity responseEntity;

    public AnubisException(Exception e) {
        if (e instanceof DataIntegrityViolationException) {
            this.responseEntity = new ResponseEntity(HttpStatus.METHOD_FAILURE);
        }
    }

    public ResponseEntity getResponseEntity() {
        return responseEntity;
    }
}