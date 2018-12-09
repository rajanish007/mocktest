package com.project.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyEntity, String> {

    @Query(value = "select * from m_faculty where f_passwd = :password and f_uname = :username or f_email = :username", nativeQuery = true)
    public FacultyEntity findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query(value = "select * from m_faculty where f_uname = :username or f_email = :username", nativeQuery = true)
    public FacultyEntity findUserByfacultyUserName(@Param("username") String username);
}
