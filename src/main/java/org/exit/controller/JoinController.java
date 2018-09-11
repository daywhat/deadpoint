package org.exit.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.exit.domain.DP_MemberVO;
import org.exit.service.DP_MemberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {
	
	@Inject
	public DP_MemberServiceImpl dpms;
	
	// join to member
	
	@RequestMapping(value="/join.go", method = RequestMethod.GET)
	public String joinMember() {
		return "member/join";
	}
	
	// join us to go welcome.jsp
	
	@RequestMapping(value="/join.do", method = RequestMethod.POST)
	@ResponseBody
	public String join(DP_MemberVO dpmvo) {
		System.out.println("111");
		dpms.DP_MemberInsert(dpmvo);
		
		return "welcome";
	}
	
	// join us to go welcome.jsp
	
		@RequestMapping(value="/welcome.go", method = RequestMethod.GET)
		public String welcome() {
			
			return "member/welcome";
		}
	
	// customer click to cancle button back to index page 
	
	@RequestMapping(value="/main.go", method = RequestMethod.GET)
	public String main() {
		
		return "redirect:/";
	}
	
	// nick name check
	
	@RequestMapping(value="/nickCheck.do", method = RequestMethod.GET)
	@ResponseBody
	public String nickCheck(String dp_nick) {
		
		String msg = "";
		
		String nick = dpms.DP_MemberNickCheck(dp_nick);
		if(nick == null){
			msg = "1";
		}else if(nick != null) {
			msg = "0";
		}
		
		return msg;
	}
	
	// userid check
	
	@RequestMapping(value="/idCheck.do", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(String dp_name) {
		
		String msg = "";
		
		String id = dpms.DP_MemberIDCheck(dp_name);
		if(id == null) {
			msg = "1";
		}else if(id != null) {
			msg = "0";
		}
		
		return msg;
	}
	

	
}
