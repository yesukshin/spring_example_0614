package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.domain.User;

@RequestMapping("/lesson04/ex01")
@Controller // jsp view를  뿌리기 위해서 @ResponseBody있으면 안됨
public class Lesson04Ex01Conytroller {
	
	@Autowired
	private UserBO userBO;
	//_view
	//@RequestMapping get,post모두다됨
	// 
	@RequestMapping(path = "/add_user_view", method=RequestMethod.GET)
	public String addUserView() {
		//WEB-INF/jsp/ 
		//.jsp
		
		return "lesson04/addUser" ;
	}
	
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="introduce", required=false) String introduce) {
		
		// db insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		// 결과페이지
		return "lesson04/afterAddUser";
		
	}
	
	@GetMapping("/get_latest_user")
	public String getLatestUserView(Model model) {
		// DB select
		User user = userBO.getLatestUser();
				
		//뷰화면에 데이터를 사용하수있도록 담는 객체
		//model는 map이랑 동일항게
		model.addAttribute("result", user);
		model.addAttribute("title", "회원정보");
		
		
		//결과페이지
		return "lesson04/getLatestUser";
		
	}
	

}
