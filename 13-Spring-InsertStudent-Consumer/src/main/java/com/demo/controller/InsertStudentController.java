package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Student;

@RestController
@RequestMapping("/insertApi")
public class InsertStudentController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/insertStudent")
	public ResponseEntity<String> insertStudent(@RequestBody Student s) {
		String url="http://zuul/getPro/ProdApi/insertStudent";
		String st= 	restTemplate.postForObject(url, s, String.class);		
	return new ResponseEntity<String>(st,HttpStatus.OK);

	}


}
