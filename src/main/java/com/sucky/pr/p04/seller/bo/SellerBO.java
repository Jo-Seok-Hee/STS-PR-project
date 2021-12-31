package com.sucky.pr.p04.seller.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.pr.p04.seller.dao.SellerDAO;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String url, String temperature) {
		return sellerDAO.insertSeller(nickname, url, temperature);
	}
}
