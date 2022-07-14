package com.capstonegroupsix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonegroupsix.api.entity.ProductInOrder;

public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
