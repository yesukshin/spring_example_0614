package com.example.lesson03.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.domain.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewMapper reviewMapper;
    
	//input:id
	//output:id에 일치하는 Review 단건
	public Review getReviewById(int id) {

		return reviewMapper.selectReviewById(id);
	}

}
