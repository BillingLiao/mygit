package com.Billing.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.Billing.Admin;

@ResponseBody
@Controller
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public List<Admin> say(){
		Admin admin = new Admin("admin","123");
		Admin admin2 = new Admin("admin2","123");
		List<Admin> list = new ArrayList<>();
		list.add(admin);
		list.add(admin2);
		return list;
	}
	
	
}
