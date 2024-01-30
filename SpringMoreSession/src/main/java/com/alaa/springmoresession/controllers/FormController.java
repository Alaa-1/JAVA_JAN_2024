package com.alaa.springmoresession.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {

	@GetMapping("/")
	public String index() {
		return "form.jsp";
	}
	
	@PostMapping("/processCar")
	public String processForm(@RequestParam("make") String make,
								@RequestParam("model") String model,
								@RequestParam("year") int year,
								@RequestParam("color") String color,
								HttpSession session,
								RedirectAttributes flash) {
		
		// put all the input values in session
		session.setAttribute("keyMake", make);
		session.setAttribute("keyModel", model);
		session.setAttribute("keyColor", color);
		session.setAttribute("keyYear", year);
		
		if(year < 2022) {
			flash.addFlashAttribute("yearError","car is too old");
			return "redirect:/";
		}
		flash.addFlashAttribute("success","You have successfully created a car");
		return "redirect:/result";
	}
	
	@GetMapping("/result")
	public String result() {
		
		return "result.jsp";
	}
	
}
