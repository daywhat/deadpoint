package org.exit.controller;

import javax.inject.Inject;

import org.exit.domain.DP_MemberVO;
import org.exit.service.DP_MemberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("id")
public class LoginController {

	@Inject
	public DP_MemberServiceImpl dpms;
	
	// login page going
	
	@RequestMapping(value = "login.go", method = RequestMethod.GET)
	public String loginGo() {
		return "member/login";
	}
	
	/*
		로그인 아이디와 비밀번호를 입력
		DB에서 비밀번호를 체크후 값이 맞으면 1
		값이 틀리면 0을 콜백하여 if문 으로 틀린 값 입력시 alert창 전송
		맞는 값 입력시 인트로 화면으로 변환
	*/
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	@ResponseBody
	public String loginDo(DP_MemberVO dpmvo, Model model, SessionStatus sessionStatus) {
 
		String msg = "";
		
		DP_MemberVO vo = dpms.DP_MemberLogin(dpmvo);
		
		if(vo !=null){
			model.addAttribute("id", vo.getDp_name());
			msg ="1";
		}else if(vo == null) {
			msg ="0";
			sessionStatus.setComplete();
		}
		
		return msg;
	}
	
	// logout Session on
	
	@RequestMapping(value = "logout.do", method = RequestMethod.GET)
	public String logout(SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		
		return "redirect:/";
	}
	
	// myPage going
	
	@RequestMapping(value = "myPage.do", method = RequestMethod.GET)
	public String myPage() {
		return "member/myPage";
	}
	
	
}


