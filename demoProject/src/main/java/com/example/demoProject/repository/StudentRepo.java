package com.example.demoProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demoProject.model.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

}
