package com.snackcase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.snackcase.pojo.Item;

public interface ItemMapper {
	@Select("select * from item")
	public List<Item> findAll();

	
	public void delete(@Param("status")int i,  @Param("id")String id);


	
	
	
}
