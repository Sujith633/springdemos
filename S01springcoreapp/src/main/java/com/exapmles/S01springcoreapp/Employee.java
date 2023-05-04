package com.exapmles.S01springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	String id;
	String name;
	private List<String> departments;
	private Map<Integer,String> products;
	private Properties lan;
	
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	public Properties getLan() {
		return lan;
	}
	public void setLan(Properties lan) {
		this.lan = lan;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departments=" + departments + ", products=" + products
				+ ", lan=" + lan + "]";
	}
	
	
	

}
