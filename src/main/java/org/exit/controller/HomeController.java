package org.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ùȭ�� ������ �۵��ϴ� ���� ��Ʈ�ѷ�
 * ���� �ΰ� Ŭ���ÿ� ù ȭ������ ���ƿ� �� �ִ�.
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
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
