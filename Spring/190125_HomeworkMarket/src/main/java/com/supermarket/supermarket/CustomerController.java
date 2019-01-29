package com.supermarket.supermarket;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supermarket.supermarket.DAO.CustomerDAO;
import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;
import com.supermarket.supermarket.VO.Sold;

@Controller
public class CustomerController {

	@Autowired
	CustomerDAO dao;
	
	@RequestMapping(value = "/insertCustomer", method = RequestMethod.POST)
	public String insertCustomer(Customer customer, Model model) {
		
		int result = dao.insertCustomer(customer);
		if(result==0) {
			model.addAttribute("warning", "�̹� �����ϴ� ���̵��Դϴ�.");
			model.addAttribute("customer", customer);
			return "customer/signUp";
		} else {
			model.addAttribute("success", "ȸ�����Կ� �����߽��ϴ�.");
		}
				
		return "customer/home";
	}
	
	@RequestMapping(value = "/loginCustomer", method = RequestMethod.GET)
	public String loginCustomer(HttpSession session, Customer customer, Model model) {
	
		Customer result = null;
		result = dao.loginCustomer(customer);

		if(result == null) {
			model.addAttribute("warning", "�α��ο� �����߽��ϴ�. ID�� PW�� Ȯ�����ּ���.");
			model.addAttribute("customer", customer);
			return "customer/login";
		} else {
			session.setAttribute("customerId", result.getCustomerId());
			return "redirect:/listProduct";
		}		
	}
	
	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public String listProduct(Model model) {
		
		ArrayList<Product> allProduct = dao.listProduct();
		model.addAttribute("Product", allProduct);		
		return "customer/listProduct";
	}
	
	@RequestMapping(value = "/purchase", method = RequestMethod.POST)
	public String purchase(Sold sold, String buy, Model model, HttpSession session) {
		
		sold.setCustomerId((String)session.getAttribute("customerId"));
		sold.setQuantity(buy);

		//�ֵ� ���̺� ����ϰ�
		int result = dao.insertSold(sold);
		System.out.println(result);
		//������Ʈ�� ���δ�Ʈ ���� ���ߵ�
		//������ ��ȣ�� ������ ����
		int result2 = dao.subtractQuantity(sold);
		
		return "redirect:/purchasedItems";
	}
	
	@RequestMapping(value = "/purchasedItems", method = {RequestMethod.GET, RequestMethod.POST})
	public String purchasedItems(HttpSession session, Model model) {
		
		System.out.println("�ƾ�");
		ArrayList<Sold> result = dao.selectSoldById((String)session.getAttribute("customerId"));
		model.addAttribute("Sold", result);
		
		return "customer/purchasedItems";
		
	}
}