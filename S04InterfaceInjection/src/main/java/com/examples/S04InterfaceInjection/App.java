package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S04InterfaceInjection/springconfig.xml");
    	OrderServices orderService = (OrderServices) ctx.getBean("orderservice");
    	orderService.placeOrder();

    }
}
