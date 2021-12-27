package com.sucky.pr.p02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sucky.pr.p02.model.Store;

@Repository
public interface StoreDAO {
	
	public List<Store> selectStoreList();
}
