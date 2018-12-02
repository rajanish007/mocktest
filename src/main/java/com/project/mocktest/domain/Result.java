package com.project.mocktest.domain;

import com.project.mocktest.constant.Status;

import java.util.Objects;

public class Result {

    private String resultId;

    private String testId;

    private String studentId;

    private int totalQuestions;

    private int correctAnswers;

    private Status status;

    public Result(String resultId,
                  String testId,
                  String studentId,
                  int totalQuestions,
                  int correctAnswers,
                  Status status) {
        this.resultId = resultId;
        this.testId = testId;
        this.studentId = studentId;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.status = status;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return totalQuestions == result.totalQuestions &&
                correctAnswers == result.correctAnswers &&
                Objects.equals(resultId, result.resultId) &&
                Objects.equals(testId, result.testId) &&
                Objects.equals(studentId, result.studentId) &&
                status == result.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, testId, studentId, totalQuestions, correctAnswers, status);
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId='" + resultId + '\'' +
                ", testId='" + testId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", totalQuestions=" + totalQuestions +
                ", correctAnswers=" + correctAnswers +
                ", status=" + status +
                '}';
    }
}
