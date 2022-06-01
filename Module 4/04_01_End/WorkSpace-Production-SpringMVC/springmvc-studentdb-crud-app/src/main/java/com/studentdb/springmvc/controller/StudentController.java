package com.studentdb.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentdb.springmvc.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents", studentService.getAllStudents());
		return "index";
	}

}
