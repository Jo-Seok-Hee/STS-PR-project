package com.sucky.pr.p02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.pr.p02.dao.StoreDAO;
import com.sucky.pr.p02.model.Store;

@Service
public class StoreBO {
	
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList(){
		
		return storeDAO.selectStoreList();
	}
}
