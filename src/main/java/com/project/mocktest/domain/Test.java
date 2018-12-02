package com.project.mocktest.domain;

import java.util.Date;
import java.util.Objects;

public class Test {

    private String testId;

    private Date testDate;

    private String questionList;

    private int testDuration;

    private String feedback;

    public Test(String testId,
                Date testDate,
                String questionList,
                int testDuration,
                String feedback) {
        this.testId = testId;
        this.testDate = testDate;
        this.questionList = questionList;
        this.testDuration = testDuration;
        this.feedback = feedback;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getQuestionList() {
        return questionList;
    }

    public void setQuestionList(String questionList) {
        this.questionList = questionList;
    }

    public int getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(int testDuration) {
        this.testDuration = testDuration;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return testDuration == test.testDuration &&
                Objects.equals(testId, test.testId) &&
                Objects.equals(testDate, test.testDate) &&
                Objects.equals(questionList, test.questionList) &&
                Objects.equals(feedback, test.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, testDate, questionList, testDuration, feedback);
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId='" + testId + '\'' +
                ", testDate=" + testDate +
                ", questionList='" + questionList + '\'' +
                ", testDuration=" + testDuration +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
