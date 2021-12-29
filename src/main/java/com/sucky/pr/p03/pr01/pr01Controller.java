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
	
	//1-1번 id값 파라미터 받기 
	@RequestMapping("/p03/pr01")
	public estate pr01(@RequestParam("id")int id) {
		
		return estateBO.getEstate(id);
	}
	
	//1-2번 rentPrice 이하범위
	@RequestMapping("/p03/pr02")
	public List<estate> pr02(@RequestParam("rentPrice")int rP){
		
		return estateBO.getEstateRent(rP);
	}
	
	//1-3번  area , price 범위지정
	@RequestMapping("/p03/pr03")
	public List<estate> pr03(@RequestParam("area")int area,@RequestParam("price")int price){
		return estateBO.getEstateAreaPrice(area,price);
	}
	

	
}
