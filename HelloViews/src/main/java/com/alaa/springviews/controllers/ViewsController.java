package com.alaa.springviews.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ViewsController {

	@GetMapping("/index")
	public String index() {
		
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dash(Model myModel) {
		
		String username = "Jane Doe";
		int age = 45;
		myModel.addAttribute("name",username);
		myModel.addAttribute("age",age);
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/test")
	public String test(Model m) {
		
		String js = "<h1>hello</h1><script>alert('You have been pwnd')</script>";
		m.addAttribute("test",js);
		return "test.jsp";
	}
	
	@GetMapping("/dojos")
	public String dojo(Model model) {
		ArrayList<Dojo> dojos = new ArrayList<Dojo>();
		dojos.add(new Dojo("San Jose"));
		dojos.add(new Dojo("Burbank"));
		dojos.add(new Dojo("Ghazala"));
		model.addAttribute("dojoList", dojos);
		return "dojo.jsp";
	}
}
