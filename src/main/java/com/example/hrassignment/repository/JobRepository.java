package com.example.hrassignment.repository;

import com.example.hrassignment.model.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobRepository extends JpaRepository<JobHistory,Integer> {
}
