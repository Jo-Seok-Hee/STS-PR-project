package com.sucky.pr.p04.seller.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.pr.p04.seller.dao.SellerDAO;
import com.sucky.pr.p04.seller.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String url, double temperature) {
		return sellerDAO.insertSeller(nickname, url, temperature);
	}
	
	public Seller getSeller(int id) {
		return sellerDAO.selectSeller(id);
	}
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
	}
}
