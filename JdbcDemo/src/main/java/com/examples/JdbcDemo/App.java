package com.examples.JdbcDemo;

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
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/JdbcDemo/springconfig.xml");
        EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");
        Employee emp = new Employee();
        emp.setId(2);
        emp.setFirstname("Jhon");
        emp.setLastname("Smith");
        employeedao.create(emp);
    }
}
