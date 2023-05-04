package com.example.S11SpringBootDataJPA.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRespository extends CrudRepository<Product,Integer>{
	
//	List<Product> findByName(String name);
//	
//	List<Product> findByNameAndId(String name);

}
