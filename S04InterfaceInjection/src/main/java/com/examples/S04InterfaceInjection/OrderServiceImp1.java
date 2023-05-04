package com.examples.S04InterfaceInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderservice")
public class OrderServiceImp1 implements OrderServices{
	@Autowired
	@Qualifier("orderdaooracle")
	OrderDAO orderdao;
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("perform bussiness logic");
		System.out.println("Ready to create order");
		
		orderdao.createOrder();
	}

}
