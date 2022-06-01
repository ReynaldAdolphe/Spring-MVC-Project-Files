package com.studentdb.springmvc.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public void saveStudent(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}else {
			throw new RuntimeException(" Student not found for id:: " + id);
		}
		return student;
	}

}
