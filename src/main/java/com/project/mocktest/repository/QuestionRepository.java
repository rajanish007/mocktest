package com.project.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,String> {

    @Query(value = "select * from m_querie where f_id = :facultyID",nativeQuery = true)
    public List<QuestionEntity> findByFacultyId(@Param("facultyID") String facultyID);

    @Query(value = "select * from m_querie order by rand() limit 10",nativeQuery = true)
    public List<QuestionEntity> findByRandom();

    @Query(value = "select * from m_querie where q_id = :questionId",nativeQuery = true)
    public QuestionEntity findByQuestionId(@Param("questionId") long questionId);
}
