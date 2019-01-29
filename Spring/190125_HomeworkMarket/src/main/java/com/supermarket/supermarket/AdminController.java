package com.supermarket.supermarket;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.supermarket.supermarket.DAO.AdminDAO;
import com.supermarket.supermarket.UTIL.PageNavigator;
import com.supermarket.supermarket.VO.Admin;
import com.supermarket.supermarket.VO.Customer;
import com.supermarket.supermarket.VO.Product;

@Controller
public class AdminController {

	@Autowired
	SqlSession sqlSession;
	
	
	@Autowired
	AdminDAO dao;
	
	public static final int boardPerPage = 5;
	public static final int pagePerGroup = 3;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminLogin() {

		return "admin/adminLogin";
	}
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public String loginAdmin(Admin admin, Model model, HttpSession session) {

		Admin result = dao.adminLogin(admin);
		
		if(result == null) {
			model.addAttribute("warning", "관리자 ID와 PW를 확인해주세요.");
			model.addAttribute("admin", admin);			
			return "admin/adminLogin";
		} else {
			
			session.setAttribute("adminId", admin.getAdminId());
			return "admin/adminHome";
		}
	}

	@RequestMapping(value = "/manageCustomer", method = RequestMethod.GET)
	public String manageCustomer(Model model) {
		
		ArrayList<Customer> result = dao.selectAllCustomer();
		
		model.addAttribute("CList", result);
		
		return "admin/manageCustomer";		
	}
	
	@RequestMapping(value = "/adminBack", method = RequestMethod.GET)
	public String adminBack() {
		
		return "redirect:/selectProduct";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Product product, Model model) {
		
		return "admin/insertProduct";
	}
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public String insertProduct(Product product, Model model) {
		
		if(product.getProductSeq()!="") {
			int result2 = dao.updateProduct(product);
			return "redirect:/selectProduct";			
		}
		
		int result = dao.insertProduct(product);

		if(result == 0) {
			model.addAttribute("warning", "등록에 실패했습니다.");
			model.addAttribute("Product", product);
			
			return "admin/insertProduct";
		} else {
			
			return "redirect:/selectProduct";
		}
		
	}
	@RequestMapping(value = "/manageProduct", method = RequestMethod.GET)
	public String manageProduct() {
	
		return "redirect:/selectProduct";
	}
	
	@RequestMapping(value = "/selectProduct", method = RequestMethod.GET)
	public String selectProduct(Model model,
			@RequestParam(value="page", defaultValue="1")int page,
			@RequestParam(value="search", defaultValue="")String search			
			) {
		int countProduct = dao.countProduct(search);
		System.out.println("countProduct : " + countProduct);
		PageNavigator navi = new PageNavigator(boardPerPage, pagePerGroup, page, countProduct);
		System.out.println(countProduct);
		ArrayList<Product> resultSearch = dao.selectAllProduct(navi, search);
		System.out.println("resultSearch.size() : " + resultSearch.size());
		model.addAttribute("Product", resultSearch);
		model.addAttribute("navi", navi);
		model.addAttribute("page", page);
		model.addAttribute("search", search);
		return "admin/manageProduct";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Product product, Model model) {
		
		Product selectedProduct = dao.selectProduct(product);
		model.addAttribute("Product", selectedProduct);
		
		return "admin/insertProduct";
	}
	
}
