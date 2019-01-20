package com.project.mocktest.domain;

import java.util.Objects;

/**
 * RESULT DTO
 */
public class Result {

    private String resultId;

    private String testId;

    private String studentId;

    private double percentage;

    private String status;

    private String feedback;

    public Result() {
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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId='" + resultId + '\'' +
                ", testId='" + testId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", percentage=" + percentage +
                ", status=" + status +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(result.percentage, percentage) == 0 &&
                Objects.equals(resultId, result.resultId) &&
                Objects.equals(testId, result.testId) &&
                Objects.equals(studentId, result.studentId) &&
                status == result.status &&
                Objects.equals(feedback, result.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, testId, studentId, percentage, status, feedback);
    }

}
