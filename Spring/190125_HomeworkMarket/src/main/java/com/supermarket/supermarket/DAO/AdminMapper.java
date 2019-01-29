package com.supermarket.supermarket.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.supermarket.supermarket.VO.Admin;
import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;

public interface AdminMapper {

	public Admin adminLogin(Admin admin);
	
	public ArrayList<Customer> selectAllCustomer();
	
	public int insertProduct(Product product);
	
	public ArrayList<Product> selectAllProduct(RowBounds rw, String search);
	
	public Product selectProduct(Product product);
	
	public int updateProduct(Product product);
	
	public int countProduct(String search);

}
