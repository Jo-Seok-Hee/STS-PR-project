package com.sucky.pr.p01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p01/pr01")
public class pr01 {
	
	//연습문제 1,2
	@RequestMapping("/1")
	public String hello() {
		
		return "hello everybody";
	}
	
	
	//연습문제 3
	@RequestMapping("/2")
	public Map<String,Integer> score(){
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("영어", 90);
		map.put("수학", 85);
		return map;
	}
}
