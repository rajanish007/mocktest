package com.project.mocktest.controller;

import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.domain.Result;
import com.project.mocktest.domain.TestVO;
import com.project.mocktest.handlers.AnubisException;
import com.project.mocktest.service.QueryService;
import com.project.mocktest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private QueryService queryService;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String createNewTest(@RequestParam("studentId") long studentId, ModelMap map) {
        List<QuestionVO> questionVOS = queryService.getRandomQueries();
        TestVO testVO = testService.createNewTest(studentId, questionVOS);
        map.addAttribute("queries", questionVOS);
        map.addAttribute("testDetail", testVO);
        return "test";
    }

    @RequestMapping(value = "/new/result", method = RequestMethod.POST)
    public ResponseEntity createNewTestResult(@RequestBody Result result) {
        try {
            testService.createNewTestResult(result);
        } catch (Exception e) {
            return new AnubisException(e).getResponseEntity();
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String getResult(@RequestParam("testId") String testId,ModelMap map){
        map.addAttribute("result",testService.getTestResult(testId));
        return "result";
    }

}
