package br.com.brunoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoweb.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
