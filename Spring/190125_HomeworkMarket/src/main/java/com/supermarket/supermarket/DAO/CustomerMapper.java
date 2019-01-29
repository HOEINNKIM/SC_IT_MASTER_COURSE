package com.supermarket.supermarket.DAO;

import java.util.ArrayList;

import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;
import com.supermarket.supermarket.VO.Sold;

public interface CustomerMapper {

	public int insertCustomer(Customer customer);
	
	public Customer loginCustomer(Customer customer);
	
	public ArrayList<Product> listProduct();
	
	public int insertSold(Sold sold);
	
	public int subtractQuantity(Sold sold);
	
	public ArrayList<Sold> selectSoldById(String customerId);
}
