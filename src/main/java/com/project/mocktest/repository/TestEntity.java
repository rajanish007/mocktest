package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "m_test")
public class TestEntity {

    @Id
    @Column(name = "t_id")
    private String testId;

    @NotNull
    @Column(name = "t_date")
    private Date testDate;

    @NotNull
    @Column(name = "t_q_list")
    private String questionList;

    @NotNull
    @Column(name = "t_duration")
    private int testDuration;

    @Column(name = "t_feedback")
    private String feedback;

    @Autowired
    public TestEntity(String testId,
                      @NotNull Date testDate,
                      @NotNull String questionList,
                      @NotNull int testDuration,
                      String feedback) {
        if(testId == null)this.testId = UUID.randomUUID().toString();
        else this.testId = testId;
        this.testDate = testDate;
        this.questionList = questionList;
        this.testDuration = testDuration;
        this.feedback = feedback;
    }

    public String getTestId() {
        return testId;
    }

    public Date getTestDate() {
        return testDate;
    }

    public String getQuestionList() {
        return questionList;
    }

    public int getTestDuration() {
        return testDuration;
    }

    public String getFeedback() {
        return feedback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return testDuration == that.testDuration &&
                Objects.equals(testId, that.testId) &&
                Objects.equals(testDate, that.testDate) &&
                Objects.equals(questionList, that.questionList) &&
                Objects.equals(feedback, that.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, testDate, questionList, testDuration, feedback);
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "testId='" + testId + '\'' +
                ", testDate=" + testDate +
                ", questionList='" + questionList + '\'' +
                ", testDuration=" + testDuration +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
