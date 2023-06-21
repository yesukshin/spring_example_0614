package com.example.lesson02.domain;

import java.util.Date;

// 일반자바,스프링에서는 해당 존재를 모른다
public class UsedGoods {
	
	private int id;
	private Integer sellerId;//널 허용일때는 Integer, 아니면 int
	private String title;
	private String description;
	private int price;
	private String pictureUrl;
	private Date createdAt;
	private Date updatedAt;
	public int getId() {
		return id;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}

    
	
	
    
}
