package com.lee.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.android.dao.ItemDAO;
import com.lee.android.domain.Item;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDAO itemDAO;
	
	
	@Override
	public List<Item> listItem(HttpServletRequest request) {

		return itemDAO.listItem();
	}

	@Override
	public Item getItem(HttpServletRequest request) {
		//파라미터를 가져오기 
String itemid= request.getParameter("itemid");
//파라미터를 정수로 변환해서 DAO 메소드에게 전달 
		return itemDAO.getItem(Integer.parseInt(itemid));
	}

}
