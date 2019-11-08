package com.course.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
