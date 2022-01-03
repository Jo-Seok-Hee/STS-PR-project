package com.sucky.pr.p04.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.pr.p04.seller.bo.SellerBO;
import com.sucky.pr.p04.seller.model.Seller;

@Controller
public class sellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	@ResponseBody
	@RequestMapping("/p04/pr01/view")
	public String firstView() {
		
		return "/p04/sellerView";
	}
	@ResponseBody
	@RequestMapping("/p04/pr01/return")
	public String pr01(
			@RequestParam("name")String name
			,@RequestParam("url")String url
			,@RequestParam("temperature")double temperature
			) {
		
		int count = sellerBO.addSeller(name, url, temperature);
		
		return "성공 : "+count;
	}
	
	
	
	@RequestMapping("/p04/pr02")
	public String pr02(Model model,@RequestParam(value="id", required=false
		
			)Integer id) {
		
		if(id==null) {
			Seller seller = sellerBO.getLastSeller();
			model.addAttribute("result", seller);
		} else {
			Seller seller = sellerBO.getSeller(id);
			model.addAttribute("result", seller);
		}
		model.addAttribute("info", "판매자 정보");
		
		return "/p04/sellerInfo";
	}
	
	
	
}
