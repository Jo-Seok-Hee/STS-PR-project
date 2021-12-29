package com.sucky.pr.p03.pr01.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.pr.p03.pr01.model.estate;



@Repository
public interface EstateDAO {
	
	//1-1번
	public estate selectEstate(@Param("id")int id);
	//1-2번
	public List<estate> selectEstateRent(@Param("rentPrice")int rP);
	
	//1-3번
	public List<estate> selectEstateAreaPrice(@Param("area")int area, @Param("price")int price);
	
	
}


