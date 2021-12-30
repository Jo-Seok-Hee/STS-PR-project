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
	
	//2-1번
	public int addEstateObject(estate es) {
		
		return estateDAO.insertEstateObject(es);
	}
	
	//2-2번
	public int addEstate(int realtorId,String address,int area, String type, int price, int rentPrice) {
		return estateDAO.insertEstate(realtorId, address, area, type, price, rentPrice);
	}
	
	//3-1번
	public int setEstate(String type, int price, int id) {
		return estateDAO.updateEstate(type, price, id);
	}
	
	//4-1 
	public int ridEstate(int id) {
		return estateDAO.deleteEstate(id);
	}
	
}
