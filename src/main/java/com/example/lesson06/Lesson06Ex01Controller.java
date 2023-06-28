package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@Controller
@RequestMapping("/lesson06/ex01")
public class Lesson06Ex01Controller {
	
	@Autowired
	UserBO userBO;
	
	//회원가입 페이지
	//회원가입 버튼 누르면
	//입력성공화면 띄우기
	
	@GetMapping("/add_user_view")
	public String addUserView() {
		
		return "lesson06/addUser";
		
	}
	
	// AJAX가 요청한 곳 = > response는 반드시 String(Data)이어야 함
	@PostMapping("/add_user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value = "email", required=false) String email,
			@RequestParam(value ="introduce", required=false) String introduce
			) {
		// db insert
		addUser(name, yyyymmdd, email, introduce);
		
		// return String
		return "성공"; //ResponseBody에 성공글자가 담긴다
	}
	
	
	
	@GetMapping("/after_add_user_view")
	public String afterAddUserView() {
		
		return "lesson06/afterAddUser";
		
	}
    
}
