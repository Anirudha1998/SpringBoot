package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
//	@RequestMapping("/home")
//	public String myhome(HttpServletRequest req) {
//		
//		String name = req.getParameter("name");
//		System.out.println("in home");
//		return "Home";
//	}
//	
//	@RequestMapping("/about")
//	public String aboutPage(HttpServletRequest req) {
//		
//		String name =req.getParameter( "name");
//		System.out.println("name" + name);
//		return "about.html";
	
	
	@RequestMapping("/")
	public String homepage(Map<String, Object> model) {
		model.put("msg","Welcom to home page");
		return "Home";
		
		
	}
	@RequestMapping("/next")
	public String newPage(Map<String, Object> model) {
		model.put("msg", "new page ");
		return "new";
	}

}
