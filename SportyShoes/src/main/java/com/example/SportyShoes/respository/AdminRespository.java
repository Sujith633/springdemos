package com.example.SportyShoes.respository;

import org.springframework.data.repository.CrudRepository;

import com.example.SportyShoes.entity.Admin;
import com.example.SportyShoes.entity.Product;

public interface AdminRespository extends CrudRepository<Product,Integer>{

}
