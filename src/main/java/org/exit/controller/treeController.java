package org.exit.controller;

import java.util.List;

import javax.inject.Inject;

import org.exit.domain.DP_OtInfoVO;
import org.exit.domain.DP_ProductVO;
import org.exit.domain.Paging;
import org.exit.service.DP_OtInfoServiceImpl;
import org.exit.service.DP_ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
 */


@Controller
public class treeController {
	
	@Inject
	private DP_OtInfoServiceImpl dpots;
	@Inject 
	public DP_ProductServiceImpl dpps;

	// deadpoint  [ ��ȭ, ��� ���� ? ]
	
		@RequestMapping(value = "/intro.go", method = RequestMethod.GET)
		public String intro() {
			return "intro";
		}
		
		@RequestMapping(value = "/totalShop.go", method = RequestMethod.GET)
		public String totalShop(Model model) {
			
			List<DP_ProductVO> dppvo = dpps.DP_ProductList();
			
			model.addAttribute("shopMenu", "click");
			model.addAttribute("dppvo", dppvo);
			return "shop/totalShop";
		}
		
		// Shop [ male ]
		
		@RequestMapping(value = "/maleShop.go", method = RequestMethod.GET)
		public String maleShop(Model model) {
			
			List<DP_ProductVO> dppvo = dpps.DP_mProductList();
			
			model.addAttribute("shopMenu", "click");
			model.addAttribute("dppvo", dppvo);
			return "shop/maleShop";
		}
		
		// Shop [ female ]
		
		@RequestMapping(value = "/femaleShop.go", method = RequestMethod.GET)
		public String femaleShop(Model model) {
			
			List<DP_ProductVO> dppvo = dpps.DP_fmProductList();
			
			model.addAttribute("shopMenu", "click");
			model.addAttribute("dppvo", dppvo);
			return "shop/femaleShop";
		}
		
		// Community [ Review ]
		
		@RequestMapping(value = "/review.go", method = RequestMethod.GET)
		public String review() {
			return "community/review";
		}
		
		// Community [ otinfo ] 
		
		@RequestMapping(value = "/otInfo.go", method = RequestMethod.GET)
		public String otInfo(Model model, String pageNum) {
			int countList = 20;	
			int page = 0;
			int sPage = 0;
			int ePage = 0;
			if(pageNum == null) { // ���۰��� ������ ���� 1 �ش�
				pageNum = "1";
				page = Integer.parseInt(pageNum); // int�� ��ȯ
				sPage =	( page - 1 ) * countList;
				ePage = page * 20;
			}else if(pageNum != null){
				page = Integer.parseInt(pageNum); // int�� ��
				sPage =	( page - 1 ) * countList;
				ePage = (page - (page - 1) ) * 20;
			}

			Paging paging = new Paging(); 
			
			paging.setsPage(sPage); // db���� ������� �Խù� ����
			paging.setePage(ePage); // db���� ������� �Խù� ��
			
			int totList = dpots.DP_OtListCount() ; // �� �Խù� ��
								// �� ȭ�鿡 ���� �Խù� ��
			int totPage = totList / countList;		// �� ������ ��
			if(totList % countList > 0) {			// �� �Խù� �� / ȭ�� �Խù� ��  ������ ���ڴ� ī��Ʈ�� �ȵǹǷ� ������ �ش�
				totPage++;
			}
			int countPage = 5;
			int startPage = ((page - 1) / countPage) * countPage + 1;
			int endPage = startPage + countPage - 1;
			if(endPage > totPage) {
				endPage = totPage;
			}

			List<DP_OtInfoVO> dpotvo = dpots.DP_OtList(paging);
			
			model.addAttribute("otInfoList", dpotvo);
			model.addAttribute("startPage", startPage);
			model.addAttribute("endPage", endPage);
			model.addAttribute("totPage", totPage);
			model.addAttribute("countPage", countPage);

			
			return "community/otInfo";
		}
		
		// Community [ Instagram ] 
		
		@RequestMapping(value = "/insta.go", method = RequestMethod.GET)
		public String insta() {
			return "community/insta";
		}
		
		// Community [ Notice ] 
		
		@RequestMapping(value = "/notice.go", method = RequestMethod.GET)
		public String notice() {
			return "community/notice";
		}
}
