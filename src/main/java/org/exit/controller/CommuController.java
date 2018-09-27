package org.exit.controller;

import javax.inject.Inject;

import org.exit.domain.DP_MemberVO;
import org.exit.domain.DP_OtInfoVO;
import org.exit.service.DP_OtInfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Community 관련 컨트롤러
 * otInfo, notice로 연결되어있다.
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		이정빈
 */


@Controller
public class CommuController {
	
	@Inject
	public DP_OtInfoServiceImpl dpots;
	
	// otInfo Write going
	@RequestMapping(value="otInfoWrite.go", method=RequestMethod.GET)
	public String otInfoWrite() {
		
		return "community/otInfoWrite";
	}
	
	//otInfo Write do it
	@RequestMapping(value="otInfoWrite.do", method=RequestMethod.POST)
	public String otInfoWriteReal(@ModelAttribute DP_MemberVO vo, DP_OtInfoVO dpotvo) {
		System.out.println(vo.getDp_id());
		System.out.println(vo.getDp_nick());
		dpotvo.setDp_id(vo.getDp_id());
		dpotvo.setDp_nick(vo.getDp_nick());
		dpots.DP_OtWrite(dpotvo);
		
		return "redirect:/otInfo.go";
	}

	
	
	
}
