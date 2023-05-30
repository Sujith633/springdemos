package com.example.Product_Management;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.Model.Product;
import com.example.repository.ProductRepository;


@SpringBootTest
class ProductManagementApplicationTests {
	
	@Autowired
	ApplicationContext context;

//	@Test
	void createProduct() {
		Product  product = new Product();
		product.setProductName("phone");
		product.setDescription("Top model");
		product.setPrice(50000.0);
		product.setStatus("Available");
		ProductRepository productRespository = context.getBean(ProductRepository.class);
		productRespository.save(product);
	}
	
}
