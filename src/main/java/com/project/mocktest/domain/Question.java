package com.project.mocktest.domain;

import java.util.Objects;

public class Question {

    private String faculty_Id;

    private int timeAllocated;

    private String correctAnswer;

    private String description;

    private String firstAnswer;

    private String secondAnswer;

    private String thirdAnswer;

    private String fourthAnswer;

    public Question(String faculty_Id,
                    int timeAllocated,
                    String correctAnswer,
                    String description,
                    String firstAnswer,
                    String secondAnswer,
                    String thirdAnswer,
                    String fourthAnswer) {
        this.faculty_Id = faculty_Id;
        this.timeAllocated = timeAllocated;
        this.correctAnswer = correctAnswer;
        this.description = description;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return timeAllocated == question.timeAllocated &&
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
        return Objects.hash(faculty_Id, timeAllocated, correctAnswer, description, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "faculty_Id='" + faculty_Id + '\'' +
                ", timeAllocated=" + timeAllocated +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", description='" + description + '\'' +
                ", firstAnswer='" + firstAnswer + '\'' +
                ", secondAnswer='" + secondAnswer + '\'' +
                ", thirdAnswer='" + thirdAnswer + '\'' +
                ", fourthAnswer='" + fourthAnswer + '\'' +
                '}';
    }
}
