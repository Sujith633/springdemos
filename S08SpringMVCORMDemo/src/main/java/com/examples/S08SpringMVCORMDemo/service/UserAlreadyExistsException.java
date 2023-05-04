package com.examples.S08SpringMVCORMDemo.service;

public class UserAlreadyExistsException extends Exception {
	
	public UserAlreadyExistsException(String email) {
		super("User already exists "+email);
	}

}
