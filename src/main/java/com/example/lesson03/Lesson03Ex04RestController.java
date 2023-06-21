package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.BO.ReviewBO;

@RestController
public class Lesson03Ex04RestController {
	
	
	@Autowired
	private ReviewBO reviewBO;
	//http://localhost/lesson03/ex04
	@RequestMapping("/lesson03/ex04")
	public String ex04(
			@RequestParam("id") int id) {
		
		reviewBO.deleteReviewById(id);
		return "삭제성공";
		
		
	}

}
