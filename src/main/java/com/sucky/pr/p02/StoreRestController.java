package com.sucky.pr.p02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sucky.pr.p02.bo.StoreBO;
import com.sucky.pr.p02.model.Store;

@RestController
public class StoreRestController {
	
	@Autowired
	private StoreBO storeBO;
	
	@RequestMapping("/p02/pr01")
	public List<Store> pr01(){
		return storeBO.getStoreList();
	}
}
