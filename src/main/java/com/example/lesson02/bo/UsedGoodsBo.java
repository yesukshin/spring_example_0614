package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service // Spring Bean이 된다, 데이터 가공하고 비즈니스로직이 있다
public class UsedGoodsBo {

	// 메소드 
	// input : Controller가 주는게 없음
	// output : List<UsedGoods>, 컨트롤러한테 
	public List<UsedGoods> getUsedGoodsList() {
		// Mapper = DAO(Data Access Object) = Repository
		// dao를 인터페이스로 만듬
		List<UsedGoods> usedGoodsList = ;
		return usedGoodsList;
		
	}
}
