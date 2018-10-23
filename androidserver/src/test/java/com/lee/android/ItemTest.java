package com.lee.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lee.android.dao.ItemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ItemTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private ItemDAO itemDAO;

	@Test
	public void connectTest() {
		//System.out.println(sqlSession);
		
		//System.out.println(sqlSession.selectList("item.listItem"));
		//System.out.println(sqlSession.selectList("item.getItem",1));
//System.out.println(sqlSession.selectOne("item.getItem",1)+"");


System.out.println(itemDAO);
System.out.println(itemDAO.getItem(1));
System.out.println(itemDAO.listItem());
	}
}
