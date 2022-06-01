package com.studentdb.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentdb.springmvc.model.Student;
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
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
		
	}
}
