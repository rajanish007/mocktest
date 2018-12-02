package com.project.mocktest.repository;

import com.project.mocktest.constant.Status;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "m_result")
public class ResultEntity {

    @Id
    @Column(name = "r_id")
    private String resultId;

    @NotNull
    @Column(name = "t_id")
    private String testId;

    @NotNull
    @Column(name = "s_id")
    private String studentId;

    @NotNull
    @Column(name = "r_query_count")
    private int totalQuestions;

    @NotNull
    @Column(name = "r_correct_ans_count")
    private int correctAnswers;

    @NotNull
    @Column(name = "status")
    private Status status;

    @Autowired
    public ResultEntity(String resultId,
                        @NotNull String testId,
                        @NotNull String studentId,
                        @NotNull int totalQuestions,
                        @NotNull int correctAnswers,
                        @NotNull Status status) {
        if(resultId == null)this.resultId = UUID.randomUUID().toString();
        else this.resultId = resultId;
        this.testId = testId;
        this.studentId = studentId;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.status = status;
    }

    public String getResultId() {
        return resultId;
    }

    public String getTestId() {
        return testId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultEntity that = (ResultEntity) o;
        return totalQuestions == that.totalQuestions &&
                correctAnswers == that.correctAnswers &&
                Objects.equals(resultId, that.resultId) &&
                Objects.equals(testId, that.testId) &&
                Objects.equals(studentId, that.studentId) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, testId, studentId, totalQuestions, correctAnswers, status);
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "resultId='" + resultId + '\'' +
                ", testId='" + testId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", totalQuestions=" + totalQuestions +
                ", correctAnswers=" + correctAnswers +
                ", status=" + status +
                '}';
    }
}
