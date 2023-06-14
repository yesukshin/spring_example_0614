package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson01/ex01")
public class Lesson01Ex01Controller {
	
   //return String => html
   //@RsponseBody
	@RequestMapping("/1")
	public String ex01_1() {
		
		String text = "예제<br>문자열을 보내는 예제";
		
	    return text;	
	}
	
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("사과",1);
		map.put("포도",1);
		map.put("바나나",1);
		map.put("배",1);
		
		return map;
	}
}
