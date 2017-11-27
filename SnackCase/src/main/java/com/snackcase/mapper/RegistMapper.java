package com.snackcase.mapper;



import org.apache.ibatis.annotations.Param;

import com.snackcase.pojo.User;

public interface RegistMapper {
	
	public void regist(User user);

	public User findone(@Param("email")String email,@Param("password")String password);
<<<<<<< HEAD

	public User findonebyname(String name);
=======
>>>>>>> 1c9c78546dbc04ddc37fb0e63e6b46f134a8c8a0
}
