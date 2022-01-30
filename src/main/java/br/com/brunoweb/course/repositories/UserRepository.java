package br.com.brunoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoweb.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
