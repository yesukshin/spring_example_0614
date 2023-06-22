package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;
	
	@GetMapping("/add_student_view")
	public String addStidentView() {
		
		return "lesson04/addStudent";
		
	}
	// 학생추가 => 방금가입한 학생정보 페이지
	
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute Student student, // jsp name 속성명과 필드명이 일치하는 곳에 세팅된다
			Model model 
			) {
		// insert DB
		studentBO.addStudent(student); //   방금 등록된 ID가 student객체에 세팅된다. 참조자료형이므로 
		student.getId();
		
		// select DB 
		Student latestStudent = studentBO.getStudentById(student.getId());
		model.addAttribute("result", latestStudent);
		
		return "lesson04/afterAddStudent";
		
	}

}
