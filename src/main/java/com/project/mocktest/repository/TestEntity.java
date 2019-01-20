package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * TEST ENTITY
 */
@Entity
@Table(name = "m_test")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private long testId;

    @NotNull
    @Column(name = "s_id")
    private long studentId;

    @NotNull
    @Column(name = "t_date")
    private Date testDate;

    @NotNull
    @Column(name = "t_q_list")
    private String questionList;

    @NotNull
    @Column(name = "t_duration")
    private Integer testDuration;

    @Autowired
    public TestEntity() {
    }

    @Autowired
    public TestEntity(@NotNull long studentId,
                      @NotNull Date testDate,
                      @NotNull String questionList,
                      @NotNull Integer testDuration) {
        this.studentId = studentId;
        this.testDate = testDate;
        this.questionList = questionList;
        this.testDuration = testDuration;
    }

    public long getTestId() {
        return testId;
    }

    public Date getTestDate() {
        return testDate;
    }

    public String getQuestionList() {
        return questionList;
    }

    public Integer getTestDuration() {
        return testDuration;
    }

    public long getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "testId=" + testId +
                ", studentId=" + studentId +
                ", testDate=" + testDate +
                ", questionList='" + questionList + '\'' +
                ", testDuration=" + testDuration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return testId == that.testId &&
                studentId == that.studentId &&
                testDuration == that.testDuration &&
                Objects.equals(testDate, that.testDate) &&
                Objects.equals(questionList, that.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, studentId, testDate, questionList, testDuration);
    }

}
