package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserMapper;
import com.example.lesson04.domain.User;

@Service
public class UserBO {
	
	@Autowired
	private UserMapper userMapper;
	
	public void addUser(String name, String yyyymmdd, String email, String introdude) {
		
		userMapper.insertUser(name, yyyymmdd, email, introdude);
		
	}
	
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}

}
