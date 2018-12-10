package com.project.mocktest.controller;

import com.project.mocktest.service.FacultyService;
import com.project.mocktest.service.QueryService;
import com.project.mocktest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private QueryService queryService;

    @RequestMapping(value = "/student")
    public String getStudentDashboard(@RequestParam("username") String username, ModelMap map) {
        map.addAttribute("student_profile",studentService.getStudent(username));
        return "dashboard_stud";
    }

    @RequestMapping(value = "/faculty")
    public String getFacultyDashboard(@RequestParam("username") String username, ModelMap map) {
        map.addAttribute("faculty_profile",facultyService.getFaculty(username));
        map.addAttribute("qList",queryService.getForFaculty(username));
        return "dashboard_faculty";
    }
}
