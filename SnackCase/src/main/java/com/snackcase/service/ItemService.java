package com.snackcase.service;

import java.util.List;

import com.snackcase.pojo.Item;

public interface ItemService {
	
	
	//查找显示全部商品
	public List<Item> findAll();

	public void delete(int i, String id);

	

}
