package com.project.mocktest.utils;

import com.project.mocktest.domain.QuestionVO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Utilities {

    public static String Base64decode(String encodedString) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedByte = decoder.decode(encodedString);
        return new String(decodedByte);
    }

    public static String Bas64encode(String string) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(string.getBytes());
        return encodedString;
    }

    public static String listToString(List<QuestionVO> questionVOS) {
        List<String> questions = new ArrayList();
        for(QuestionVO questionVO : questionVOS){
            questions.add(Long.toString(questionVO.getQuestionId()));
        }
        return StringUtils.join(questions,',');
    }

    public static Integer addList(List<QuestionVO> questionVOS) {
        Integer sum = 0;
        for (QuestionVO questionVO : questionVOS) {
            sum += questionVO.getTimeAllocated();
        }
        return sum;
    }
}
