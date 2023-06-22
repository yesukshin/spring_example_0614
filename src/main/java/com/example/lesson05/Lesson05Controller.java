package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		
		return "lesson05/ex01";
		
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		//1) List<String>
		
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("파인애츨");
		fruits.add("멜론");
		fruits.add("포도");
		fruits.add("딸기");
		
		model.addAttribute("fruits",fruits);
		
		//2) List<map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		
		user.put("name", "신예숙");
		user.put("age", 20);
		user.put("hobby", "수영");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "박종화");
		user.put("age", 30);
		user.put("hobby", "수영");
		users.add(user);
		
		model.addAttribute("users",users);
		
		return "lesson05/ex02";
		
	}

}
