package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// RestController 아님 주의, ResponseBody 어노테이션 안씀
// jsp 화면 뿌리기
@Controller
public class Lesson01Ex02Controller {
    
	//http://localhost:88/lesson01/ex02
	
	//jsp의 경로를 리턴한다. 
	//ResponseBody가 없으면 뷰인지 확인하여 jsp이면 html로 만들어 내려준다
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// "/WEB-INF/jsp/        .jsp"
		// .jsp
		//return "/WEB-INF/jsp/lesson01/ex02.jsp"; //jsp경로
		return "lesson01/ex02"; //jsp경로
	}
}
