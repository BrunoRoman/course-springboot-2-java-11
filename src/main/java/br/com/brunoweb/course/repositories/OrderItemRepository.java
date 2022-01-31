package br.com.brunoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoweb.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
