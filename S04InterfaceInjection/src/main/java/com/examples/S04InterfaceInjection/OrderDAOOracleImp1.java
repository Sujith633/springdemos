package com.examples.S04InterfaceInjection;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDAOOracleImp1 implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Open connetion to Oracle DB");
		System.out.println("Run insert statement on Oracle DB");
		System.out.println("Order creadted in Oracle DB");

	}

}
