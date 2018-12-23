package com.project.mocktest.domain;

import java.util.Objects;

public class Question {

    private long questionId;

    private String faculty_Id;

    private int timeAllocated;

    private String correctAnswer;

    private String description;

    private String firstAnswer;

    private String secondAnswer;

    private String thirdAnswer;

    private String fourthAnswer;

    private int totalAttempts;

    private int correctAttempts;

    public Question() {
    }

    public String getFaculty_Id() {
        return faculty_Id;
    }

    public void setFaculty_Id(String faculty_Id) {
        this.faculty_Id = faculty_Id;
    }

    public int getTimeAllocated() {
        return timeAllocated;
    }

    public void setTimeAllocated(int timeAllocated) {
        this.timeAllocated = timeAllocated;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    public void setTotalAttempts(int totalAttempts) {
        this.totalAttempts = totalAttempts;
    }

    public int getCorrectAttempts() {
        return correctAttempts;
    }

    @Override
    public String toString() {
        return "Question{" +
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

    public void setCorrectAttempts(int correctAttempts) {
        this.correctAttempts = correctAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionId == question.questionId &&
                timeAllocated == question.timeAllocated &&
                totalAttempts == question.totalAttempts &&
                correctAttempts == question.correctAttempts &&
                Objects.equals(faculty_Id, question.faculty_Id) &&
                Objects.equals(correctAnswer, question.correctAnswer) &&
                Objects.equals(description, question.description) &&
                Objects.equals(firstAnswer, question.firstAnswer) &&
                Objects.equals(secondAnswer, question.secondAnswer) &&
                Objects.equals(thirdAnswer, question.thirdAnswer) &&
                Objects.equals(fourthAnswer, question.fourthAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, faculty_Id, timeAllocated, correctAnswer, description, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, totalAttempts, correctAttempts);
    }

}
