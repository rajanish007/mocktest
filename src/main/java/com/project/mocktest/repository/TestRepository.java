package com.project.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * TEST REPOSITORY
 */
@Repository
public interface TestRepository extends JpaRepository<TestEntity,String> {

}
