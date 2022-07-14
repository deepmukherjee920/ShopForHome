package com.capstonegroupsix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonegroupsix.api.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, String> {

}
