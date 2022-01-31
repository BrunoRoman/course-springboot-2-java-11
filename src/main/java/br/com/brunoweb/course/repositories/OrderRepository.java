package br.com.brunoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
