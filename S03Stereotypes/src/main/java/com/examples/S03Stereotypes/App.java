package com.examples.S03Stereotypes;

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
        
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S03Stereotypes/springconfig.xml");
    	Instructor instructor = (Instructor) ctx.getBean("instructor");
    	System.out.println(instructor);

    }

}
