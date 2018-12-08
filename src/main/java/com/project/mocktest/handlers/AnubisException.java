package com.project.mocktest.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class AnubisException extends Exception{

    public AnubisException(HttpStatus status){
        switch (status){
            case FORBIDDEN:
                throw new HttpClientErrorException(HttpStatus.FORBIDDEN);
            case BAD_REQUEST:
                throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
    }

}