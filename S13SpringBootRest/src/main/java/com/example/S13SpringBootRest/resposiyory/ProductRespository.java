package com.example.S13SpringBootRest.resposiyory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootRest.entity.Product;


public interface ProductRespository extends CrudRepository<Product,Integer>{
	
//	List<Product> findByName(String name);
//	List<Product> findAll();
//	List<Product> findByNameAndId(String name);

}
