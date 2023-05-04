package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCORMDemo.dao.UserDao;
import com.examples.S08SpringMVCORMDemo.entity.User;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException{
		if(userdao.findUser(user.getEmail()) != null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userdao.fndall();
	}

}
