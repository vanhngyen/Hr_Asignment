package com.example.hrassignment.repository;

import com.example.hrassignment.model.OrderItem;
import com.example.hrassignment.model.OrderItemID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemID> {
}
