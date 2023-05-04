package com.examples.S03Stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	
	@Value("12")
	private int id;
	
	@Value("Jon")
	private String name;
	
	@Autowired
	private Address homeaddress;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress + "]";
	}
	
	

}
