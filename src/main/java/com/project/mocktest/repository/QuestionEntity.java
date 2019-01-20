package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

/**
 * QUESTION ENTITY
 */
@Entity
@Table(name = "m_querie")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "q_id")
    private long questionId;

    @NotNull
    @Column(name = "f_id")
    private String faculty_Id;

    @NotNull
    @Column(name = "q_time_allocated")
    private int timeAllocated;

    @NotNull
    @Column(name = "q_correct_ans")
    private String correctAnswer;

    @NotNull
    @Column(name = "q_desc", unique = true)
    private String description;

    @NotNull
    @Column(name = "q_first_ans")
    private String firstAnswer;

    @NotNull
    @Column(name = "q_second_ans")
    private String secondAnswer;

    @NotNull
    @Column(name = "q_third_ans")
    private String thirdAnswer;

    @NotNull
    @Column(name = "q_fourth_ans")
    private String fourthAnswer;

    @Column(name = "q_total_attempts", columnDefinition = "int default '0'")
    private Integer totalAttempts;

    @Column(name = "q_correct_attempts", columnDefinition = "int default '0'")
    private Integer correctAttempts;

    @Autowired
    public QuestionEntity() {
    }

    @Autowired
    public QuestionEntity(@NotNull String faculty_Id,
                          @NotNull int timeAllocated,
                          @NotNull String correctAnswer,
                          @NotNull String description,
                          @NotNull String firstAnswer,
                          @NotNull String secondAnswer,
                          @NotNull String thirdAnswer,
                          @NotNull String fourthAnswer,
                          int totalAttempts,
                          int correctAttempts) {
        this.faculty_Id = faculty_Id;
        this.timeAllocated = timeAllocated;
        this.correctAnswer = correctAnswer;
        this.description = description;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.totalAttempts = totalAttempts;
        this.correctAttempts = correctAttempts;
    }

    public long getQuestionId() {
        return questionId;
    }

    public String getFaculty_Id() {
        return faculty_Id;
    }

    public int getTimeAllocated() {
        return timeAllocated;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setTotalAttempts(Integer totalAttempts) {
        this.totalAttempts = totalAttempts;
    }

    public void setCorrectAttempts(Integer correctAttempts) {
        this.correctAttempts = correctAttempts;
    }

    public Integer getTotalAttempts() {
        return totalAttempts;
    }

    public Integer getCorrectAttempts() {
        return correctAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionEntity that = (QuestionEntity) o;
        return questionId == that.questionId &&
                timeAllocated == that.timeAllocated &&
                Objects.equals(faculty_Id, that.faculty_Id) &&
                Objects.equals(correctAnswer, that.correctAnswer) &&
                Objects.equals(description, that.description) &&
                Objects.equals(firstAnswer, that.firstAnswer) &&
                Objects.equals(secondAnswer, that.secondAnswer) &&
                Objects.equals(thirdAnswer, that.thirdAnswer) &&
                Objects.equals(fourthAnswer, that.fourthAnswer) &&
                Objects.equals(totalAttempts, that.totalAttempts) &&
                Objects.equals(correctAttempts, that.correctAttempts);
    }

    @Override
    public String toString() {
        return "QuestionEntity{" +
                "questionId=" + questionId +
                ", faculty_Id='" + faculty_Id + '\'' +
                ", timeAllocated=" + timeAllocated +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", description='" + description + '\'' +
                ", firstAnswer='" + firstAnswer + '\'' +
                ", secondAnswer='" + secondAnswer + '\'' +
                ", thirdAnswer='" + thirdAnswer + '\'' +
                ", fourthAnswer='" + fourthAnswer + '\'' +
                ", totalAttempts=" + totalAttempts +
                ", correctAttempts=" + correctAttempts +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, faculty_Id, timeAllocated, correctAnswer, description, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, totalAttempts, correctAttempts);
    }

}
