package org.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ������ ������ ��Ʈ�ѷ�
 * Session���� ������ ���̵� �ԷµǸ� 
 * ���� ������ ������ �ȴ�.
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
 */


@Controller
public class AdminController {

	@RequestMapping(value="adOtInfo", method = RequestMethod.GET)
	public String adOtInfo() {
		return "addOtInfo";
	}
	
}
