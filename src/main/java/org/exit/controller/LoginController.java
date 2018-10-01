package org.exit.controller;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exit.domain.DP_MemberVO;
import org.exit.service.DP_MemberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
 */


@Controller
@SessionAttributes({"id", "RSA_P_KEY"})
public class LoginController {

	@Inject
	public DP_MemberServiceImpl dpms;
	
	// login page going
	
	@RequestMapping(value = "login.go", method = RequestMethod.GET)
	public String loginGo(HttpServletRequest req, HttpServletResponse res) throws NoSuchAlgorithmException, InvalidKeySpecException {

/*		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(2048);
		KeyPair keyPair = generator.genKeyPair();
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();
		
		req.setAttribute("RSA_P_KEY", privateKey);
		
		RSAPublicKeySpec publicSpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);

		String publicKeyModulus = publicSpec.getModulus().toString(16);
		String publicKeyExponent = publicSpec.getPublicExponent().toString(16);
		
		req.setAttribute("publicKeyModulus", publicKeyModulus);
		req.setAttribute("publicKeyExponent", publicKeyExponent);
		*/
		
		
		return "member/login";
	}
	
	/*
		�α��� ���̵�� ��й�ȣ�� �Է�
		DB���� ��й�ȣ�� üũ�� ���� ������ 1
		���� Ʋ���� 0�� �ݹ��Ͽ� if�� ���� Ʋ�� �� �Է½� alertâ ����
		�´� �� �Է½� ��Ʈ�� ȭ������ ��ȯ
	*/
	
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	@ResponseBody
	public String loginDo(DP_MemberVO dpmvo, Model model, SessionStatus sessionStatus) throws ServletException {
 
		String msg = "";
		


	        
/*	        if (privateKey == null) {
	            throw new RuntimeException("��ȣȭ ���Ű ������ ã�� �� �����ϴ�.");
	        }
	        try {
	            String username = decryptRsa(privateKey, securedUsername);
	            String password = decryptRsa(privateKey, securedPassword);
	            vo.setDp_name(username);
	            vo.setDp_pwd(password);
		        vo = dpms.DP_MemberLogin(dpmvo);
	        } catch (Exception ex) {
	            throw new ServletException(ex.getMessage(), ex);
	        }*/

	        
	        
		DP_MemberVO vo = dpms.DP_MemberLogin(dpmvo);
		
		
		if(vo !=null){
			model.addAttribute("id", vo);
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
	
	
    private String decryptRsa(PrivateKey privateKey, String securedValue) throws Exception {
        System.out.println("will decrypt : " + securedValue);
        Cipher cipher = Cipher.getInstance("RSA");
        byte[] encryptedBytes = hexToByteArray(securedValue);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        String decryptedValue = new String(decryptedBytes, "utf-8"); // ���� ���ڵ� ����.
        return decryptedValue;
    }

    /**
     * 16�� ���ڿ��� byte �迭�� ��ȯ�Ѵ�.
     */
    public static byte[] hexToByteArray(String hex) {
        if (hex == null || hex.length() % 2 != 0) {
            return new byte[]{};
        }

        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length(); i += 2) {
            byte value = (byte)Integer.parseInt(hex.substring(i, i + 2), 16);
            bytes[(int) Math.floor(i / 2)] = value;
        }
        return bytes;
    }

}


