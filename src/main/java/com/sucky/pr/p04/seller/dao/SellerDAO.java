package com.sucky.pr.p04.seller.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDAO {

	public int insertSeller(
			@Param("nickname")String nickname
			, @Param("url")String url
			, @Param("temperature")String temperature
		    );
}
