package com.example.demoProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demoProject.model.Student;
import com.example.demoProject.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	
	public void addStudent(Student s) {
		studentRepo.save(s);
	}
	
	
	public Student getStudent(String name) {
	return studentRepo.findById(name).get();	
	}
	
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
		}
	
	
	
	
	
	
	}