package com.project.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, String> {

    @Query(value = "select * from m_result where t_id = :testId", nativeQuery = true)
    public ResultEntity findByTestId(@Param("testId") String testId);

    @Query(value = "select * from m_result order by percentage desc limit 10",nativeQuery = true)
    public List<ResultEntity> findByTopper();
}
