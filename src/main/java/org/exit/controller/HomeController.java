package org.exit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController { 
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		
		return "index";
	}
	
	@RequestMapping(value = "/mainImg.go", method = RequestMethod.GET)
	public String mainImg() {

		
		return "redirect:/";
	}
	
	
}
