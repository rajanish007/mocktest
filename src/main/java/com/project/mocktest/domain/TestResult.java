package com.project.mocktest.domain;

import java.util.Objects;

public class TestResult {

    private String testId;

    private String resultId;

    private String questionID;

    private String answerRecieved;

    public TestResult(String testId,
                      String resultId,
                      String questionID,
                      String answerRecieved) {
        this.testId = testId;
        this.resultId = resultId;
        this.questionID = questionID;
        this.answerRecieved = answerRecieved;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getAnswerRecieved() {
        return answerRecieved;
    }

    public void setAnswerRecieved(String answerRecieved) {
        this.answerRecieved = answerRecieved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return Objects.equals(testId, that.testId) &&
                Objects.equals(resultId, that.resultId) &&
                Objects.equals(questionID, that.questionID) &&
                Objects.equals(answerRecieved, that.answerRecieved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, resultId, questionID, answerRecieved);
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "testId='" + testId + '\'' +
                ", resultId='" + resultId + '\'' +
                ", questionID='" + questionID + '\'' +
                ", answerRecieved='" + answerRecieved + '\'' +
                '}';
    }
}
