package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBo;
import com.example.lesson02.domain.UsedGoods;

@RestController
public class Lesson02Ex01RestContoller {
	
	@Autowired
	private UsedGoodsBo usedGoodsBo;//DI
	//http://localhost:88/lesson02/ex01
	//UsedGoods : 필드, 겟터,셋터만 있음 
	//-Entity : 테이블 컬럼과 완전일치 할때
	//-domain : 테이블보단 넒은 도메인 개념
	//-DTO : Data Transfer Object, 테이블+가공필드(레이어들을 넘나드는 객체)
	//-모델 : 도메인급이랑 비슷함, 테이블보단 넒은 도메인 개념
	//-VO : value object(read-only)
	@RequestMapping("lesson02/ex01")
	public List<UsedGoods> ex01(){
		//BO(Business Object) = service
		List<UsedGoods> usedGoodsList = usedGoodsBo.getUsedGoodsList();
		return usedGoodsList; // json응답
	}

}
