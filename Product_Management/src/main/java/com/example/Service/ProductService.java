package com.example.Service;

import java.util.List;

import com.example.Model.Product;


public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public Iterable<Product> getAllProduct();

	public Product getProductById(Integer id);

	public String deleteProduct(Integer id);

	public Product editProduct(Product product,Integer id);
	
}
