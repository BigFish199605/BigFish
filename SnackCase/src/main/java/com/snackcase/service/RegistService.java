package com.snackcase.service;

import com.snackcase.pojo.User;

public interface RegistService {

	 public void regist(User user);

	public User findone(String email, String password);
	
	

}
