package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Student;

@RestController
@RequestMapping("/updateApi")
public class Controller {
	
	@Autowired
	private RestTemplate template;
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		String url="";
		
		return"Student Updated";
	}

}
