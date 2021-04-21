package com.example.hrassignment.repository;

import com.example.hrassignment.model.ProductDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductDescriptionRepository extends JpaRepository<ProductDescription,Integer> {
}
