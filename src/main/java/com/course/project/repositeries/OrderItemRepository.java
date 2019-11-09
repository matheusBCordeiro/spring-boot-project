package com.course.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
