package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

/**
 * STUDENT ENTITY
 */
@Entity
@Table(name = "m_student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private long studentId;

    @NotNull
    @Column(name = "s_name")
    private String studentName;

    @NotNull
    @Column(name = "s_passwd")
    private String studentPassword;

    @NotNull
    @Column(name = "s_uname")
    private String studentUserName;

    @NotNull
    @Column(name = "s_email",unique = true)
    private String studentEmail;

    @Autowired
    public StudentEntity() {}

    @Autowired
    public StudentEntity(@NotNull String studentName,
                         @NotNull String studentPassword,
                         @NotNull String studentUserName,
                         @NotNull String studentEmail) {
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        this.studentUserName = studentUserName;
        this.studentEmail = studentEmail;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentPassword, that.studentPassword) &&
                Objects.equals(studentUserName, that.studentUserName) &&
                Objects.equals(studentEmail, that.studentEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentPassword, studentUserName, studentEmail);
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentUserName='" + studentUserName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
