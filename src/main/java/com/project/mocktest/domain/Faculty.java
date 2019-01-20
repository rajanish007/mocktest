package com.project.mocktest.domain;

import java.util.Objects;

/**
 * FACULTY DTO
 */
public class Faculty {

    private long facultyId;

    private String facultyName;

    private String facultyPassword;

    private String facultyUserName;

    private String facultyEmail;

    public Faculty() {
    }

    public Faculty(long facultyId,
                   String facultyName,
                   String facultyPassword,
                   String facultyUserName,
                   String facultyEmail) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPassword = facultyPassword;
        this.facultyUserName = facultyUserName;
        this.facultyEmail = facultyEmail;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPassword() {
        return facultyPassword;
    }

    public void setFacultyPassword(String facultyPassword) {
        this.facultyPassword = facultyPassword;
    }

    public String getFacultyUserName() {
        return facultyUserName;
    }

    public void setFacultyUserName(String facultyUserName) {
        this.facultyUserName = facultyUserName;
    }

    public String getFacultyEmail() {
        return facultyEmail;
    }

    public void setFacultyEmail(String facultyEmail) {
        this.facultyEmail = facultyEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(facultyId, faculty.facultyId) &&
                Objects.equals(facultyName, faculty.facultyName) &&
                Objects.equals(facultyPassword, faculty.facultyPassword) &&
                Objects.equals(facultyUserName, faculty.facultyUserName) &&
                Objects.equals(facultyEmail, faculty.facultyEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyId, facultyName, facultyPassword, facultyUserName, facultyEmail);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", facultyPassword='" + facultyPassword + '\'' +
                ", facultyUserName='" + facultyUserName + '\'' +
                ", facultyEmail='" + facultyEmail + '\'' +
                '}';
    }
}
