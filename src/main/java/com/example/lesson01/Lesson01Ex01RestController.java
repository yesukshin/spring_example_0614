package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lesson01/ex01")
public class Lesson01Ex01RestController {
	// http://localhost:88/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_03() {
		return "@RestContoller를 사용해 String을 리턴한다";
	}
	
	@RequestMapping("/4")
	public Map<String, String> ex01_04() {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("rk", "가");
		map.put("rk", "가");
		map.put("rk", "가");
		
		return map;
		
	}
	
	// http://localhost:88/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		
		Data data = new Data();  // 자바 bean
		data.setId(1);
		data.setName("신예숙");
		
		return data;
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		
		Data data = new Data();  // 자바 bean
		data.setId(1);
		data.setName("신예숙");
		
		//return new ResponseEntity<>(data, HttpStatus.OK);
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
