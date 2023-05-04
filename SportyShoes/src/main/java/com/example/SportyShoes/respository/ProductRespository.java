package com.example.SportyShoes.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.SportyShoes.entity.Product;
import com.example.SportyShoes.entity.User;


public interface ProductRespository extends CrudRepository<Product,Integer>{
	
//	List<Product> findByName(String name);
//	List<Product> findAll();
//	List<Product> findByNameAndId(String name);
	List<Product> findById(int id);

	
}
