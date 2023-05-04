package com.examples.JdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("employeedao")
public class Employeeimp implements EmployeeDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		 String sql = "insert into employee values (?, ?, ?)";
	     int res= jdbcTemplate.update(sql,employee.getId(),employee.getFirstname(),employee.getLastname());
	     
		return res;
	}

}
