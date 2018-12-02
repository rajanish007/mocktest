package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TestResultEntityId implements Serializable {

    @NotNull
    @Column(name = "t_id")
    private String testId;

    @NotNull
    @Column(name = "r_id")
    private String resultId;

    @NotNull
    @Column(name = "q_id")
    private String questionID;

    @Autowired
    public TestResultEntityId(@NotNull String testId,
                              @NotNull String resultId,
                              @NotNull String questionID) {
        this.testId = testId;
        this.resultId = resultId;
        this.questionID = questionID;
    }

    public String getTestId() {
        return testId;
    }

    public String getResultId() {
        return resultId;
    }

    public String getQuestionID() {
        return questionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResultEntityId that = (TestResultEntityId) o;
        return Objects.equals(testId, that.testId) &&
                Objects.equals(resultId, that.resultId) &&
                Objects.equals(questionID, that.questionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, resultId, questionID);
    }

    @Override
    public String toString() {
        return "TestResultEntityId{" +
                "testId='" + testId + '\'' +
                ", resultId='" + resultId + '\'' +
                ", questionID='" + questionID + '\'' +
                '}';
    }
}
