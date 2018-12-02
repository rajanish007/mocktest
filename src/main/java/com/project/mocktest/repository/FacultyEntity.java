package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "m_faculty")
public class FacultyEntity {

    @Id
    @Column(name = "f_id")
    private String facultyId;

    @NotNull
    @Column(name = "f_name")
    private String facultyName;

    @NotNull
    @Column(name = "f_passwd")
    private String facultyPassword;

    @NotNull
    @Column(name = "f_uname")
    private String facultyUserName;

    @NotNull
    @Column(name = "f_email")
    private String facultyEmail;

    @Autowired
    public FacultyEntity(String facultyId,
                         @NotNull String facultyName,
                         @NotNull String facultyPassword,
                         @NotNull String facultyUserName,
                         @NotNull String facultyEmail) {
        if(facultyId == null)this.facultyId = UUID.randomUUID().toString();
        else this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPassword = facultyPassword;
        this.facultyUserName = facultyUserName;
        this.facultyEmail = facultyEmail;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyPassword() {
        return facultyPassword;
    }

    public String getFacultyUserName() {
        return facultyUserName;
    }

    public String getFacultyEmail() {
        return facultyEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyEntity that = (FacultyEntity) o;
        return Objects.equals(facultyId, that.facultyId) &&
                Objects.equals(facultyName, that.facultyName) &&
                Objects.equals(facultyPassword, that.facultyPassword) &&
                Objects.equals(facultyUserName, that.facultyUserName) &&
                Objects.equals(facultyEmail, that.facultyEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyId, facultyName, facultyPassword, facultyUserName, facultyEmail);
    }

    @Override
    public String toString() {
        return "FacultyEntity{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", facultyPassword='" + facultyPassword + '\'' +
                ", facultyUserName='" + facultyUserName + '\'' +
                ", facultyEmail='" + facultyEmail + '\'' +
                '}';
    }
}
