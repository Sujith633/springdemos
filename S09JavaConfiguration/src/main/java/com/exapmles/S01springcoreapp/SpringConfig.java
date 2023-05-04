package com.exapmles.S01springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setId("1");
		emp.setName("Max");
		return emp;
	}

	@Bean
	public Employee emp2() {
		Employee emp = new Employee();
		emp.setId("2");
		emp.setName("Maxxy");
		return emp;
	}

	@Bean
	public Employee emp3() {
		Employee emp = new Employee();
		emp.setId("3");
		emp.setName("Kenny");
		return emp;
	}
	
	@Bean
	public Employee emp4() {
		Employee emp = new Employee();
		emp.setId("4");
		emp.setName("Sammy");
		List<String> departments = new ArrayList<>();
		departments.add("admin");
		departments.add("HR");
		departments.add("Sales");
		emp.setDepartments(departments);
		return emp;
	}

	@Bean
	public Employee emp5() {
		Employee emp = new Employee();
		emp.setId("5");
		emp.setName("Kenny");
		return emp;
	}

	@Bean
	public Employee emp6() {
		Employee emp = new Employee();
		emp.setId("6");
		emp.setName("Amy");
		return emp;
	}
	
	@Bean
	public Employee emp7() {
		Employee emp = new Employee();
		emp.setId("7");
		emp.setName("Amy1");
	
		return emp;
	}
}
