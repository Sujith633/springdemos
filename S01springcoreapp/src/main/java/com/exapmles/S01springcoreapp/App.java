package com.exapmles.S01springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	maven-archetype-quickstart
        System.out.println( "Hello World!" );
        demo4();
 //       demo1();
    }
    private static void demo4() {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/exapmles/S01springcoreapp/springconfig4.xml");
        EmployeeDAO dao = (EmployeeDAO) ctx.getBean("emp");
        System.out.println(dao);
    }
    
    private static void demo3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/exapmles/S01springcoreapp/springconfig3.xml");
        Computer c1 = (Computer) ctx.getBean("home");
        System.out.println(c1);
        Computer c2 = (Computer) ctx.getBean("mycom");
        System.out.println(c2);
    }
    private static void demo2() {
    	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/exapmles/S01springcoreapp/springconfig2.xml");
		Car c1= (Car)  ctx.getBean("car");
		System.out.println(c1.hashCode());
		Car c2= (Car)  ctx.getBean("car");
		System.out.println(c2.hashCode());
		Object b1 = ctx.getBean("bank");
		System.out.println(b1.hashCode());
		Object b2 = ctx.getBean("bank");
		System.out.println(b2.hashCode());


    }

	private static void demo1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/exapmles/S01springcoreapp/springconfig.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println(emp);
        Employee emp1 = (Employee) ctx.getBean("emp1");
        System.out.println(emp1);
        Employee emp2 = (Employee) ctx.getBean("emp2");
        System.out.println(emp2);
        Employee emp4 = (Employee) ctx.getBean("emp4");
        System.out.println(emp4);
        Employee emp5 = (Employee) ctx.getBean("emp5");
        System.out.println(emp5);
        Employee emp3 = (Employee) ctx.getBean("emp3");
        System.out.println(emp3);
	}
}
