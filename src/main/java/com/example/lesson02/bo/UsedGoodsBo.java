package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.domain.UsedGoods;

@Service // Spring Bean이 된다, 데이터 가공하고 비즈니스로직이 있다
public class UsedGoodsBo {
	
	// 필드
	// 스프링 빈을 가져올때는 아래처럼 , 전문용어로 dependency Injection(DI) -> 의존성주입 -> Spring bean
	// DI : 객체를 주입한다(스프링빈에 있는걸 여기로 주입한다)
	@Autowired 
	private UsedGoodsMapper usedGoodsMapper;

	// 메소드 
	// input : Controller가 주는게 없음
	// output : List<UsedGoods>, 컨트롤러한테 
	public List<UsedGoods> getUsedGoodsList() {
		// Mapper = DAO(Data Access Object) = Repository
		// dao를 인터페이스로 만듬
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
		
	}
}
