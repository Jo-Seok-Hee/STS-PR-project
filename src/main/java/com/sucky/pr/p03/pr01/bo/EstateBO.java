package com.sucky.pr.p03.pr01.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.pr.p03.pr01.dao.EstateDAO;
import com.sucky.pr.p03.pr01.model.estate;

@Service
public class EstateBO {
	
	@Autowired
	private EstateDAO estateDAO;
	//1-1번
	public estate getEstate(int id) {
		return estateDAO.selectEstate(id);
	}
	//1-2번
	public List<estate> getEstateRent(int rP) {
		return estateDAO.selectEstateRent(rP);
	}
	
	//1-3번
	public List<estate> getEstateAreaPrice(int area,int price){
		return estateDAO.selectEstateAreaPrice(area,price);
	}
	
	
}
