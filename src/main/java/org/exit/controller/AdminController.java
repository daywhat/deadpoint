package org.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 관리자 계정의 컨트롤러
 * Session값에 관리자 아이디가 입력되면 
 * 값을 가지고 수행이 된다.
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		이정빈
 */


@Controller
public class AdminController {

	@RequestMapping(value="adOtInfo", method = RequestMethod.GET)
	public String adOtInfo() {
		return "addOtInfo";
	}
	
}
