package com.examples.S08SpringMVCDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelview = new ModelAndView();
		modelview.addObject("id",123);
		modelview.addObject("name","SUjith");
		modelview.addObject("salary",123000);

		modelview.setViewName("hello");
		return modelview;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read() {
		ModelAndView modelview = new ModelAndView();
		 Employee emp = new Employee();
	        emp.setId(2);
	        emp.setName("Jhon");
	        emp.setSalary(50000);
		modelview.addObject("employee",emp);
		
		modelview.setViewName("hello");
		return modelview;
	}
	
	@RequestMapping("/employees")
	public ModelAndView read1() {
		ModelAndView modelview = new ModelAndView();
		
		List<Employee> employees = new ArrayList<>();
		
		 Employee emp = new Employee();
	        emp.setId(2);
	        emp.setName("Jhon");
	        emp.setSalary(50000);
	        employees.add(emp);
	        
	        emp = new Employee();
	        emp.setId(3);
	        emp.setName("Jhonny");
	        emp.setSalary(98000);
	        employees.add(emp);
	        
	        emp = new Employee();
	        emp.setId(4);
	        emp.setName("Max");
	        emp.setSalary(76000);
	        employees.add(emp);
	        
		modelview.addObject("employee",employees);
		
		modelview.setViewName("hello");
		return modelview;
	}
	
	@RequestMapping("/showdata")
	public ModelAndView read2(@RequestParam("id") int id,@RequestParam("name") String name) {
		
		System.out.println("ID: "+id);
		System.out.println("Name:"+name);
		ModelAndView mv = new ModelAndView();
		 mv.addObject("id",id);
		 mv.addObject("name",name);
		mv.setViewName("showdata");
		return mv;
	}

}
