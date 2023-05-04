package com.examples.S04InterfaceInjection;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDAOMMysqlImp1 implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Open connection to MYSQL DB");
		System.out.println("Run insert statement on Mysql");
		System.out.println("Order creaed in MYSQL DB");
	}

}
