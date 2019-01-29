package com.supermarket.supermarket.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;
import com.supermarket.supermarket.VO.Sold;

@Repository
public class CustomerDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertCustomer(Customer customer) {

		int result = 0;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

		try {
			result = mapper.insertCustomer(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}

	public Customer loginCustomer(Customer customer) {

		Customer result = null;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

		try {
			result = mapper.loginCustomer(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}

	public ArrayList<Product> listProduct() {

		ArrayList<Product> result = null;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

		try {
			result = mapper.listProduct();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}

	public int insertSold(Sold sold) {

		int result = 0;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

		try {
			result = mapper.insertSold(sold);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}
	
	public int subtractQuantity(Sold sold) {

		int result = 0;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

		try {
			result = mapper.subtractQuantity(sold);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}

	public ArrayList<Sold> selectSoldById(String customerId) {
		
		ArrayList<Sold> result = null;
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
		
		try {
			result = mapper.selectSoldById(customerId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;
	};
	
}
