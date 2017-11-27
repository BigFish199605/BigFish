package com.snackcase.service.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snackcase.mapper.BackOrderMapper;
import com.snackcase.pojo.Order;
@Service
public class BackOrderServiceImpl implements BackOrderService{
	@Autowired
	private BackOrderMapper backOrderMapper;

	@Override
	public List<Order> findOrderList() {
		// TODO Auto-generated method stub
		return backOrderMapper.findOrderMapper();
	}

}
