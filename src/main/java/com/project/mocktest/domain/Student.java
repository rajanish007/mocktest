package com.project.mocktest.domain;

import java.util.Objects;

public class Student {

    private String studentId;

    private String studentName;

    private String studentPassword;

    private String studentUserName;

    private String studentEmail;

    public Student() {
    }

    public Student(String studentId,
                   String studentName,
                   String studentPassword,
                   String studentUserName,
                   String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        this.studentUserName = studentUserName;
        this.studentEmail = studentEmail;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) &&
                Objects.equals(studentName, student.studentName) &&
                Objects.equals(studentPassword, student.studentPassword) &&
                Objects.equals(studentUserName, student.studentUserName) &&
                Objects.equals(studentEmail, student.studentEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentPassword, studentUserName, studentEmail);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentUserName='" + studentUserName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
