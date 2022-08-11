package com.gv4.core.repositories;

import com.gv4.core.models.entities.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {
}
