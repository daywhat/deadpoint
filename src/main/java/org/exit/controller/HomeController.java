package org.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 첫화면 켜질떄 작동하는 메인 컨트롤러
 * 메인 로고를 클릭시에 첫 화면으로 돌아올 수 있다.
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		이정빈
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
