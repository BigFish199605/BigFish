package com.snackcase.service;

<<<<<<< HEAD
=======
import java.util.UUID;

>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snackcase.mapper.RegistMapper;
import com.snackcase.pojo.User;
<<<<<<< HEAD
@Service
public class RegistServiceImpl implements RegistService {
	@Autowired
	private RegistMapper registMapper;

	@Override
	public User findonebyUsername(String username) {
		return registMapper.findonebyname(username);
	}

	@Override
	public User findone(String email, String password) {
		return registMapper.findone(email, password);
	}

	@Override
	public void regist(User user) {
		registMapper.regist(user);
=======

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
		
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
	}

}
