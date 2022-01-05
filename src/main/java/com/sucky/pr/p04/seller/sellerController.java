package com.sucky.pr.p04.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.pr.p04.seller.bo.SellerBO;

@Controller
public class sellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	
	@RequestMapping("/p04/pr01/view")
	public String firstView() {
		
		return "/p04/sellerView";
	}
	
	@ResponseBody
	@RequestMapping("/p04/pr01/return")
	public String pr01(
			@RequestParam("name")String name
			, @RequestParam("url")String url
			, @RequestParam("temperature")String temperature
			
			) {
		
		int count = sellerBO.addSeller(name, url, temperature);
		
		return "추가 성공!!"+count;
	}
}
