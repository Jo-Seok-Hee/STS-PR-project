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
	
	public estate getEstate(int id) {
		return estateDAO.selectEstate(id);
	}
	
	public List<estate> getEstateRent(int rent) {
		return estateDAO.selectEstateRent(rent);
	}
}
