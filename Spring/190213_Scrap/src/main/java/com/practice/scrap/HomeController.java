package com.practice.scrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = "/selectNews")
	public String selectNews(String key_word, int page) throws Exception {
		
		String url ="http://www.jobkorea.co.kr/Search/?";

		String params = 
				"&IsCoInfoSC=false"
				+ "&IsRecruit=false"
				+ "&ord=1"
				+ "&Order=1"
				+ "&page=" + page + ""
				+ "&stext=" + key_word + ""
				+ "&pageSize=30"
				+ "&pageType=GI";
		
//		1.Document를 가져온다
		Document doc = Jsoup.connect(url + params).get();
		
//		2. 목록을 가져온다.
		Elements element = doc.select("#smGiList .list .detailList li");
		
//		3. 목록(배열)에서 정보를 가져온다.
		int index = 0;
		for (Element ele : element) {
			System.out.println(++index + " :: " + ele.text());
			System.out.println("========================================\n\n");
		}
		
		return "home";
	}
	
}
