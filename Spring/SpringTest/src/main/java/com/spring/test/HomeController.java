package com.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.VO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	//�������� ���� 1.
	// "/" �׼��� �� /index.jsp �� �׼����� ȣ���ϴ� ���̴�. method�� get�� post�� ó���ϴ� ���̴�.
	// return�� ���� "home"�̶�� �̸��� ���� jsp ������ view���� ã�� �����Ѵ�. �̷��� ����� ������ ������ ����̴�.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
	
		return "home";
	}

	//�������� ���� 2.
	//form ���� input�� name ���� ���� String�� �Ķ���ͷ� �ǳ��ָ� �˾Ƽ� �ν�
	//���� ���� ���� ���� vo�� ���� �� �ִ�. �� vo�ȿ� ����� ��ü�� �̸��� jsp���� name ���� ��ġ�ؾ� �Ѵ�.
	
	//�������� ����3.
	//���� Ŭ���̾�Ʈ�� �������� ��  Model ��ü�� �־ �����Ѵ�.
	//��ü�� �������� ��, jsp�ȿ��� vo.�ʵ���� ����ϸ� �ٷ� ���� ��밡���ϴ�.
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(VO vo, Model model) {
		//System.out.println("!!" + message);
		System.out.println("!!" + vo.getMessage());
		
		model.addAttribute("vo", vo);
		return "result";
	}
	
	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String task(VO vo, Model model) {
		System.out.println("task �޼��忡 ������" + vo);
		model.addAttribute("vo", vo);
		return "task";
	}
	
	
	
	
	
}
