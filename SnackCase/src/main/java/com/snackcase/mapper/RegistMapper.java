package com.snackcase.mapper;



import org.apache.ibatis.annotations.Param;

import com.snackcase.pojo.User;

public interface RegistMapper {
	
	public void regist(User user);

	public User findone(@Param("email")String email,@Param("password")String password);
}
