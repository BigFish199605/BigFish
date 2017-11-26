package com.snackcase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snackcase.pojo.Item;

public interface ItemMapper {
	@Select("select * from item")
	public List<Item> findAll();
	
}
