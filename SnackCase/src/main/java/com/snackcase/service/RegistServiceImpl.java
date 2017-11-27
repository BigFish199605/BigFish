package com.snackcase.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snackcase.mapper.RegistMapper;
import com.snackcase.pojo.User;




@Service
public class RegistServiceImpl implements RegistService {
	@Autowired
	RegistMapper registMapper;

	@Override
	public void regist(User user) {

		String userId = UUID.randomUUID().toString();

		user.setUserId(userId);
		user.setRole(1);
		registMapper.regist(user);

	}

	@Override
	public User findone(String email, String password) {
		return  registMapper.findone(email, password);
	}

	@Override
	public User findonebyUsername(String username) {
		return findonebyUsername(username);
	}

}
