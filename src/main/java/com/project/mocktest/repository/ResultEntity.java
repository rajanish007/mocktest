package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RESULT ENTITY
 */
@Entity
@Table(name = "m_result")
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private long resultId;

    @NotNull
    @Column(name = "t_id")
    private String testId;

    @NotNull
    @Column(name = "s_id")
    private String studentId;

    @NotNull
    @Column(name = "percentage")
    private double percentage;

    @NotNull
    @Column(name = "status")
    private String status;

    @Column(name = "t_feedback")
    private String feedback;

    @Autowired
    public ResultEntity() {
    }

    @Autowired
    public ResultEntity(@NotNull String testId,
                        @NotNull String studentId,
                        @NotNull double percentage,
                        @NotNull String status,
                        String feedback) {
        this.testId = testId;
        this.studentId = studentId;
        this.percentage = percentage;
        this.status = status;
        this.feedback = feedback;
    }

    public long getResultId() {
        return resultId;
    }

    public String getTestId() {
        return testId;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "resultId=" + resultId +
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
        ResultEntity that = (ResultEntity) o;
        return resultId == that.resultId &&
                Double.compare(that.percentage, percentage) == 0 &&
                Objects.equals(testId, that.testId) &&
                Objects.equals(studentId, that.studentId) &&
                status == that.status &&
                Objects.equals(feedback, that.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, testId, studentId, percentage, status, feedback);
    }

}
