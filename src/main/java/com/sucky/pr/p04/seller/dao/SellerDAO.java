package com.sucky.pr.p04.seller.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.pr.p04.seller.model.Seller;

@Repository
public interface SellerDAO {

	public int insertSeller(
			@Param("nickname")String nickname
			, @Param("url")String url
			, @Param("temperature")double temperature
		    );
	
	public Seller selectSeller(
			@Param("id")int id
			);
	
	public Seller selectLastSeller();
}
