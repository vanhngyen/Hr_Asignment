package com.example.hrassignment.repository;

import com.example.hrassignment.model.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}
