package com.gv4.core.repositories;

import com.gv4.core.models.entities.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {
    @Query("select s from SemesterEntity s")
    List<SemesterEntity> findBySemesterNumber();
}