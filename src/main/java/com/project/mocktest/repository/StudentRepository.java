package com.project.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * STUDENT REPOSITORY
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String> {

    @Query(value = "select * from m_student where s_passwd = :password and s_uname = :username or s_email = :username", nativeQuery = true)
    public StudentEntity findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query(value = "select * from m_student where s_uname = :username or s_email = :username", nativeQuery = true)
    public StudentEntity findUserByStudentUserName(@Param("username") String username);

    @Query(value = "select * from m_student where s_id = :studentId", nativeQuery = true)
    public StudentEntity findByStudentId(@Param("studentId") String studentId);
}
