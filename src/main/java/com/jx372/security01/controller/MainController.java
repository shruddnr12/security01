package com.jx372.security01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping({"","/"})
	public String main(){
		return "index";
	}
	
	@RequestMapping("/admin")
	public String admin(){
		return "admin";
	}
	
	@RequestMapping("/user")
	public String user(){
		return "user";
	}

}
