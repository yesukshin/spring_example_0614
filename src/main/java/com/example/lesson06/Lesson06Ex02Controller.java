package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06/ex02")
@Controller
public class Lesson06Ex02Controller {
	
	@Autowired
	UserBO userBO;
	
	//회원가입 화면
	@GetMapping("/add_name_view")
	public String addNameView() {
		
		return "lesson06/addName";
		
	}
	
	// AJAX요청, 중복확인
	@GetMapping("/is_duplication")
	@ResponseBody
	public Map<String, Boolean> isDuplication(
			@RequestParam("name") String name) {
		
		// DB조회
		boolean existUser = userBO.existUserByName(name);
		
		// AJAX로 응답
		Map<String, Boolean> result = new HashMap<>();
		result.put("isDuplication", existUser);
		return result;
	}
	
}
