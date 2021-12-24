package com.sucky.pr.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p01/pr02")
public class pr02 {
	@RequestMapping("/1")
	public List<Map<String, Object>> listMap(){
		
		List<Map<String,Object>> list = new ArrayList<>();
			Map<String, Object> map = new HashMap<String, Object>() {
		        { 
		            put("rate", 15);
		            put("directer", "봉준호"); 
		            put("time", 131); 
		            put("title", "기생충");
		            
		        } 
		    };
		    list.add(map);
		    
		    map = new HashMap<String, Object>() {
		        { 
		            put("rate", 0);
		            put("directer", "로베르토 베니니"); 
		            put("time", 116); 
		            put("title", "인생은 아름다워");
		            
		        } 
		    };
		    list.add(map);    
		    map = new HashMap<String, Object>() {
		        { 
		            put("rate", 12);
		            put("directer", "놀란"); 
		            put("time", 147); 
		            put("title", "인셉션");
		            
		        } 
		    };
		    list.add(map);   
		    map = new HashMap<String, Object>() {
		        { 
		            put("rate", 19);
		            put("directer", "윤종빈"); 
		            put("time", 133); 
		            put("title", "범죄와의 전쟁");
		            
		        } 
		    };
		    list.add(map);
		    
		    map = new HashMap<String, Object>() {
		        { 
		            put("rate", 15);
		            put("directer", "프란시스 로렌스"); 
		            put("time", 137); 
		            put("title", "헝거게임");
		            
		        } 
		    };
		    list.add(map);   
		    
		   return list;
		   
	}
	
	@RequestMapping("/2")
	public ArrayList<Data> noticeboard(){
		
		ArrayList<Data> notice = new ArrayList<>();
		
		Data data = new Data();
		
		data.setTitle("안녕하세요");
		data.setUser("hagulu");
		data.setContent("안녕하세요, 앞으로 잘 부탁 드려요");
		
		notice.add(data);
		
		data = new Data();
		
		data.setTitle("헐 대박");
		data.setUser("bada");
		data.setContent("오늘 목요일이었어, 금요일인줄");
		
		notice.add(data);
		
		data = new Data();
		
		data.setTitle("데이트썰 풉니다");
		data.setUser("dulumary");
		data.setContent("....");
		
		notice.add(data);
		
		return notice;
		
		
	}

	@RequestMapping("/3")
	public ResponseEntity<Data> entity(){

		Data data = new Data();
		
		data.setTitle("안녕하세요");
		data.setUser("hagulu");
		data.setContent("안녕하세요, 앞으로 잘 부탁 드려요");

		ResponseEntity<Data> entity = new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}

	
	
}
