package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {

	public Review selectReviewById(int id);

	// 파라미터가 2개 이상일때만 param어노테이션 사용
	// insert할때 마이바티스가 성공한 행의 갯수를 리턴해준다
	public int insertReview(Review review);
	
	// 파라미터가 2개 이상일때는 맵으로 만들고 xml에 전달한다
	public int insertReviewAsField(@Param("storeId") int storeId, 
			                       @Param("menu") String menu, 
			                       @Param("userName") String userName,
			                       @Param("point") double point, 
			                       @Param("review") String review);

	public int updateReviewById(@Param("id") int id,  
			                    @Param("review") String review);
	
	public void deleteReviewById(int id);

}