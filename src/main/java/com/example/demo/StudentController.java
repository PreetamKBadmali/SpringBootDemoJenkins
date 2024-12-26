package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/student/hello
@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!!";
	}
}
