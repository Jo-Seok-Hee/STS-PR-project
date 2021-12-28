package com.sucky.pr.p03.pr01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sucky.pr.p03.pr01.bo.EstateBO;
import com.sucky.pr.p03.pr01.model.estate;


@RestController
public class pr01Controller {
	
	@Autowired
	private EstateBO estateBO;
	
	@RequestMapping("/p03/pr01")
	public estate pr01(@RequestParam("id")int id) {
		
		return estateBO.getEstate(id);
	}
	
	@RequestMapping("/p03/pr02")
	public List<estate> pr02(@RequestParam("rentPrice")int rent){
		
		return estateBO.getEstateRent(rent);
	}
}
