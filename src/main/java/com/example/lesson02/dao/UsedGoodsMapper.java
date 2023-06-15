package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.domain.UsedGoods;

@Repository
public interface UsedGoodsMapper {
	
	// 메소드
	// input : 없음
	// output : List<UsedGoods> = > bo(service)에게 돌려줌
	// 인터페이스니까 구현안함
	public List<UsedGoods> selectUsedGoodsList();
	
}
