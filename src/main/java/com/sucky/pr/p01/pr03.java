package com.sucky.pr.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pr03 {
	
	@RequestMapping("/p01/pr03/1")
	public String view() {
		
		return "/p01/pr03";
	}
}
