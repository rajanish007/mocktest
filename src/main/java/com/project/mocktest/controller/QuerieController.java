package com.project.mocktest.controller;

import com.project.mocktest.domain.Question;
import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.QueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/querie")
public class QuerieController {

    @Autowired
    private QueryService queryService;

    private Logger logger = LoggerFactory.getLogger(QuerieController.class);

    /**
     * Querie Creator
     *
     * @param question
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity createQuerie(@RequestBody Question question) {
        try {
            queryService.createQuery(question);
        } catch (Exception e) {
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Querie Delete Service
     *
     * @param qid
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntity deleteQuerie(@RequestParam("qid") Long qid) {
        try {
            queryService.deleteQuery(qid);
        } catch (Exception e) {
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity((HttpStatus.OK));
    }


}
