package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.BO.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	//http://localhost:88/lesson03/ex01?id=3
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id  // 아규먼트가 id한개일때 필수파라미터로
			//@RequestParam(value = "id") int id, // 필수파라미터
			//@RequestParam(value = "id", required = true) int id) // 필수파라미터
			//@RequestParam(value = "id", required = false) Integer id // 비필수파라미터
			//@RequestParam(value = "id", defaultValue = "1") int id //비필수 파라미터
			
			)
	{
		
		return reviewBO.getReviewById(id);
	    
	}

}
