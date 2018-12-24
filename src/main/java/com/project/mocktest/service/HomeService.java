package com.project.mocktest.service;

import com.project.mocktest.domain.RankBoardVO;
import com.project.mocktest.domain.Result;
import com.project.mocktest.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private TestService testService;

    public List<RankBoardVO> getRankBoard() {
        List<Result> resultList = testService.getToppersResult();
        List<Student> studentList = testService.getToppers(resultList);
        List<RankBoardVO> rankBoardVOS = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {
            RankBoardVO rankBoardVO = new RankBoardVO();
            rankBoardVO.setName(studentList.get(i).getStudentName());
            rankBoardVO.setRank(Integer.toString(i + 1));
            rankBoardVO.setScore(resultList.get(i).getPercentage());
            rankBoardVO.setUsername(studentList.get(i).getStudentUserName());
            rankBoardVO.setFeedback(resultList.get(i).getFeedback());
            rankBoardVOS.add(rankBoardVO);
        }
        return rankBoardVOS;
    }

}
