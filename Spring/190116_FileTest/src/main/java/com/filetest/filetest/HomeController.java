package com.filetest.filetest;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final String UPLOADPATH="C:/upload/";
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(MultipartFile uploadFile, Model model) {
		
		String fileName = uploadFile.getOriginalFilename();
		model.addAttribute("fileName", fileName);
		
		try {
			uploadFile.transferTo(new File(UPLOADPATH + fileName));			
		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return "home";
	}
	
	@RequestMapping(value="/fileDownLoad", method = RequestMethod.GET)
	public void fileDownLoad(HttpServletResponse response, String fileName) {

		response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
		FileInputStream fis;
		ServletOutputStream sos;		
		
		try {
			
			fis = new FileInputStream(UPLOADPATH + fileName);
			sos = response.getOutputStream();
			
			fis.close();
			sos.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}