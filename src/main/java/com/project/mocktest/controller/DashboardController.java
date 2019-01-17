package com.project.mocktest.controller;

import com.project.mocktest.domain.QuestionVO;
import com.project.mocktest.service.FacultyService;
import com.project.mocktest.service.HomeService;
import com.project.mocktest.service.QueryService;
import com.project.mocktest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DASHBOARD CONTROLLER
 */
@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private HomeService homeService;

    @Autowired
    private QueryService queryService;

    /**
     * Get Attributes for Student Dashboard
     * @param username
     * @param map
     * @return view
     */
    @RequestMapping(value = "/student")
    public String getStudentDashboard(@RequestParam("username") String username, ModelMap map) {
        map.addAttribute("student_profile", studentService.getStudent(username));
        return "dashboard_stud";
    }

    /**
     * Get Attributes for Faculty Dashboard
     * @param username
     * @param map
     * @return view
     */
    @RequestMapping(value = "/faculty")
    public String getFacultyDashboard(@RequestParam("username") String username, ModelMap map) {
        map.addAttribute("faculty_profile", facultyService.getFaculty(username));
        map.addAttribute("qList", queryService.getForFaculty(username));
        map.addAttribute("feedbackList", homeService.getRankBoard());
        return "dashboard_faculty";
    }

    /**
     * Get Queries uploaded by Faculty
     * @param username
     * @return view
     */
    @RequestMapping(value = "/faculty/queries", method = RequestMethod.GET)
    @ResponseBody
    public List<QuestionVO> getFacultyQueries(@RequestParam("username") String username) {
        return queryService.getForFaculty(username);
    }
}
