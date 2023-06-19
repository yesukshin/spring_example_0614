package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.BO.ReviewBO;

@RestController
public class Lesson03Ex03RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost:88/lesson03/ex03
	@RequestMapping("/lesson03/ex03?id=23&review=도미노피자역시맛있다")
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		
		int row =  reviewBO.updateReviewById(id,review);
		
		return "변경건수" + row;
		
	}
}
