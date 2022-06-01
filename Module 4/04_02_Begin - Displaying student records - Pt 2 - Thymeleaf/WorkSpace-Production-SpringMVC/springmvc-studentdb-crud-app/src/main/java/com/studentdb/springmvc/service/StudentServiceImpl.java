package com.studentdb.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdb.springmvc.model.Student;
import com.studentdb.springmvc.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
