package com.snackcase.service;

import com.snackcase.pojo.User;

public interface RegistService {

	public User findonebyUsername(String username);

	public User findone(String email, String password);

	public void regist(User user);

	
	

}
