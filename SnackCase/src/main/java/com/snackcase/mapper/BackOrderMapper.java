package com.snackcase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snackcase.pojo.Order;

public interface BackOrderMapper {

	@Select("select * from order_u")
	public List<Order> findOrderAll();

}
