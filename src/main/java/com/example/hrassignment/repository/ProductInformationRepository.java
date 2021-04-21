package com.example.hrassignment.repository;

import com.example.hrassignment.model.ProductInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductInformationRepository extends JpaRepository<ProductInformation,Integer> {
}
