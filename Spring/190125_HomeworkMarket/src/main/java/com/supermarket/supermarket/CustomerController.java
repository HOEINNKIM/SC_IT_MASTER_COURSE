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
			model.addAttribute("warning", "이미 존재하는 아이디입니다.");
			model.addAttribute("customer", customer);
			return "customer/signUp";
		} else {
			model.addAttribute("success", "회원가입에 성공했습니다.");
		}
				
		return "customer/home";
	}
	
	@RequestMapping(value = "/loginCustomer", method = RequestMethod.GET)
	public String loginCustomer(HttpSession session, Customer customer, Model model) {
	
		Customer result = null;
		result = dao.loginCustomer(customer);

		if(result == null) {
			model.addAttribute("warning", "로그인에 실패했습니다. ID와 PW를 확인해주세요.");
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

		//솔드 테이블에 등록하고
		int result = dao.insertSold(sold);
		System.out.println(result);
		//업데이트로 프로덕트 수량 빼야됨
		//시퀀스 번호와 수량을 전달
		int result2 = dao.subtractQuantity(sold);
		
		return "redirect:/purchasedItems";
	}
	
	@RequestMapping(value = "/purchasedItems", method = {RequestMethod.GET, RequestMethod.POST})
	public String purchasedItems(HttpSession session, Model model) {
		
		System.out.println("아아");
		ArrayList<Sold> result = dao.selectSoldById((String)session.getAttribute("customerId"));
		model.addAttribute("Sold", result);
		
		return "customer/purchasedItems";
		
	}
}