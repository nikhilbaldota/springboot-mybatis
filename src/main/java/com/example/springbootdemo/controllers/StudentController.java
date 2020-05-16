package com.example.springbootdemo.controllers;

import com.example.springbootdemo.models.Student;
import com.example.springbootdemo.repositories.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired StudentMapper studentMapper;

	@GetMapping
	public List<Student> list() {
		return studentMapper.getAllStudents();
	}

}
