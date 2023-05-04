package com.example.S11SpringBootDataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.entity.ProductRespository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createProduct() {
		Product  product = new Product();
		product.setName("phone");
		product.setDes("Top model");
		product.setPrice(50000);
		ProductRespository productRespository = context.getBean(ProductRespository.class);
		productRespository.save(product);
	}
//	@Test
	void raedProduct() {
		ProductRespository productRespository = context.getBean(ProductRespository.class);
		Optional<Product> op = productRespository.findById(4);
		if(op.isPresent()) {
			Product product = op.get();
			System.out.println(product);
		}
		else {
			System.out.println("Product not found");
		}
//		productRespository.save(product);
	}
	
//@Test
	void updateProduct() {
		ProductRespository productRespository = context.getBean(ProductRespository.class);
		Optional<Product> op = productRespository.findById(2);
		if(op.isPresent()) {
			Product product = op.get();
			System.out.println(product);
			product.setName("Blue");
			productRespository.save(product);
		}
		else {
			System.out.println("Product not found");
		}
	}
	
//	@Test
	void findallProduct() {
		ProductRespository productRespository = context.getBean(ProductRespository.class);
		List<Product> op =  (List<Product>) productRespository.findAll();
		System.out.println(op);
	}
	
//	@Test
//	void findProductByName() {
//		ProductRespository productRespository = context.getBean(ProductRespository.class);
//		List<Product> op = productRespository.findByName("Blue");
//		System.out.println(op);
//	}

}
