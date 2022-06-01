package com.studentdb.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentdb.springmvc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
