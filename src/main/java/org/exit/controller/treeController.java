package org.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class treeController {

	// deadpoint  [ 명화, 명언 삽입 ? ]
	
		@RequestMapping(value = "/intro.go", method = RequestMethod.GET)
		public String intro() {
			return "intro";
		}
		
		@RequestMapping(value = "/totalShop.go", method = RequestMethod.GET)
		public String totalShop(Model model) {
			

			model.addAttribute("shopMenu", "click");
			
			return "shop/totalShop";
		}
		
		// Shop [ male ]
		
		@RequestMapping(value = "/maleShop.go", method = RequestMethod.GET)
		public String maleShop(Model model) {
			
			model.addAttribute("shopMenu", "click");
			
			return "shop/maleShop";
		}
		
		// Shop [ female ]
		
		@RequestMapping(value = "/femaleShop.go", method = RequestMethod.GET)
		public String femaleShop(Model model) {
			
			model.addAttribute("shopMenu", "click");
			
			return "shop/femaleShop";
		}
		
		// Community [ Review ]
		
		@RequestMapping(value = "/review.go", method = RequestMethod.GET)
		public String review() {
			return "community/review";
		}
		
		// Community [ otinfo ] 
		
		@RequestMapping(value = "/otInfo.go", method = RequestMethod.GET)
		public String otInfo() {
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
