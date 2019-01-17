package com.project.mocktest.controller;

import com.project.mocktest.domain.RankBoardVO;
import com.project.mocktest.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * HOME CONTROLLER
 */
@Controller
public class HomeContoller {

    @Autowired
    private HomeService homeService;

    /**
     * Home View Parameter Providerr
     * @param map
     * @return view
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHome(ModelMap map) {
        List<RankBoardVO> ranking = homeService.getRankBoard();
        map.addAttribute("ranking", ranking);
        return "index";
    }

}
