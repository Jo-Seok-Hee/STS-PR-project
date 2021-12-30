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
	
	//2-1번
	@RequestMapping("/p03/pr04")
	public int pr04() {
		//realtorId = 3, address = "푸리지용 리버 303동", 
		//area = 89, type= "매매" price= 100000
		
		estate es = new estate();
		
		es.setRealtorId(3);
		es.setAddress("푸르지용 리버 303동");
		es.setArea(89);
		es.setType("매매");
		es.setPrice(100000);
		
		int count =  estateBO.addEstateObject(es);
		
		return count;
		
		
	}
	
	//2-2번
	@RequestMapping("/p03/pr05")
	public String pr05(@RequestParam("realtorId")int realtorId) {
//		address : 썅떼빌리버 오피스텔 814호
//		area : 45
//		type : 월세
//		price : 100000
//		rentPrice : 120
		
		int count = estateBO.addEstate(realtorId, "쌍떼빌리버 오피스텔", 45, "월세", 100000, 120);
		
		return "입력결과 : "+count;
	}
	
	//3-1번
	@RequestMapping("/p03/pr06")
	public String pr06() {
		
		int count = estateBO.setEstate("전세", 70000, 24);
		return "성공 햇다 "+count;
	}
	
	//4-1
	@RequestMapping("/p03/pr07")
	public String pr07(@RequestParam("id")int id) {
		
		int count = estateBO.ridEstate(id);
		
		return "성공 : " + count;
	}
	
}
