package com.alaa.springsession.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {

	@GetMapping("/form")
	public String displayForm() {
		
		return "/other/form.jsp";
	}
	
	@PostMapping("/processForm")
	public String process(@RequestParam("email") String email,
							@RequestParam("password") String pass,
								HttpSession s) {
		System.out.println(email + " " + pass);
		
		s.setAttribute("password", pass);
		s.setAttribute("email", email);
		return "redirect:/results";
	}
	
	@GetMapping("/results")
	public String res() {
		
		return "/other/result.jsp";
	}
	@GetMapping("/clear")
	public String clearSession(HttpSession session) {
		session.invalidate();
		return "redirect:/results";
	}
	
	
	
}
