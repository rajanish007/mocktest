package com.project.mocktest.domain;

import java.util.Date;
import java.util.Objects;

/**
 *TEST DTO
 */
public class Test {

    private long testId;

    private long studentId;

    private Date testDate;

    private String questionList;

    private Integer testDuration;

    public Test() {
    }

    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
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

    public Integer getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(Integer testDuration) {
        this.testDuration = testDuration;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return testDuration == test.testDuration &&
                Objects.equals(testId, test.testId) &&
                Objects.equals(studentId, test.studentId) &&
                Objects.equals(testDate, test.testDate) &&
                Objects.equals(questionList, test.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, studentId, testDate, questionList, testDuration);
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId='" + testId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", testDate=" + testDate +
                ", questionList='" + questionList + '\'' +
                ", testDuration=" + testDuration +
                '}';
    }
}
