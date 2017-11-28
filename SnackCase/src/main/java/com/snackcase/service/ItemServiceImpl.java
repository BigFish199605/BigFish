package com.snackcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snackcase.mapper.ItemMapper;
import com.snackcase.pojo.Item;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> findAll() {
		return itemMapper.findAll();
	}

	@Override
	public void delete(int i, String id) {
		itemMapper.delete(i,id);
		
	}


	
	

}
