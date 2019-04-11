package com.example.demoProject.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProject.model.Student;
import com.example.demoProject.service.StudentService;



@RestController
@RequestMapping("/default")
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addstudent")
	public void addNewStudent(Student s) {
		studentService.addStudent(s);
	}
	
	@GetMapping(value="/getstudent/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentService.getStudent(name);
	}
	
	@GetMapping("/getallstudent")
	public List<Student> getStudents() {
		return studentService.getAllStudent();
	}
	

}
