package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.BO.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
@RequestMapping("/lesson03/ex02")
public class Lesson03Ex02RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/1")
	public String ex02_1() {
		// 객체를 만들어서 
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겸혼밥세트");
		review.setUserName("신예숙");
		review.setPoint(4.5);
		review.setReview("맛있어요");
		
		int successRow = reviewBO.addReview(review);
		
		return "성공된 행의 갯수 : " + successRow;
		
	}
	
	@RequestMapping("/2")
	public String ex02_2(
			) {
		// 객체를 만들어서 
		//Review review = new Review();
//		review.setStoreId(7);
//		review.setMenu("삼겸혼밥세트");
//		review.setUserName("신예숙");
//		review.setPoint(4.5);
//		review.setReview("맛있어요");
		
		int row = reviewBO.addReviewAsField(4,"하와이안피자","신예숙",4.3,"맛있엉요");
		
		return "성공된 행의 갯수 : " + row;
		
	}

}
