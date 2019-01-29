package com.supermarket.supermarket.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supermarket.supermarket.UTIL.PageNavigator;
import com.supermarket.supermarket.VO.Admin;
import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;

@Repository
public class AdminDAO {

	@Autowired
	SqlSession sqlSession;
	
	public Admin adminLogin(Admin admin) {

		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		Admin result = null;
		
		try {
			result = mapper.adminLogin(admin);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;
		
	}
	
	public ArrayList<Customer> selectAllCustomer(){
		
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		ArrayList<Customer> result = null;
		try {
			result = mapper.selectAllCustomer();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;
		
	}
	
	public int insertProduct(Product product) {
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		int result = 0;
		try {
			result = mapper.insertProduct(product);
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return result;
		
	}
	
	public ArrayList<Product> selectAllProduct(PageNavigator navi, String search) {

		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		ArrayList<Product> result = null;
		try {
			
			RowBounds rw = new RowBounds(navi.getStartBoardPage(), navi.getBoardPerPage());
			
			result = mapper.selectAllProduct(rw, search);			
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;
		
	}
	
	public Product selectProduct(Product product) {

		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		Product result = null;
		try {
			result = mapper.selectProduct(product);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;
		
	}
	
	public int updateProduct(Product product) {
		
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		int result = 0;
		try {
			result = mapper.updateProduct(product);
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;
	}
	
	public int countProduct(String search) {
		
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		int result = 0;
		try {
			result = mapper.countProduct(search);
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;
		
	}
}
