package com.project.mocktest.controller;

import com.project.mocktest.domain.Question;
import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.QueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/querie")
public class QuerieController {

    @Autowired
    private QueryService queryService;

    private Logger logger = LoggerFactory.getLogger(QuerieController.class);

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseEntity createQuerie(@RequestBody Question question){
        try {
            queryService.createQuery(question);
        }catch (Exception e){
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

//    @RequestMapping(value = "/get",method = RequestMethod.GET)
//    @ResponseBody
//    public List<QuestionVO> getQueriesForFaculty(@RequestParam("facultyId") String facultyId, ModelMap map){
//        return queryService.getForFaculty(facultyId);
//    }

}
