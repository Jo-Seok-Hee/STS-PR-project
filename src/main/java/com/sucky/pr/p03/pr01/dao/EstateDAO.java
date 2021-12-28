package com.sucky.pr.p03.pr01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.pr.p03.pr01.model.estate;

@Repository
public interface EstateDAO {
	
	public estate selectEstate(@Param("id")int id);
	
	public List<estate> selectEstateRent(@Param("rentPrice")int rent);
}


