package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.Studentservice;

@RestController
@RequestMapping("/ProdApi")
public class ProducerController { 

	    @Autowired
        private Studentservice service;
	
	@GetMapping("/check")
	public String check() {
		return  "Producer Working";
	}
	
	@PostMapping("/insertStudent")
	public String insertStudent(@RequestBody Student s) {
		service.saveStudent(s);
		return "Student Save SuccessFull";
	}
	
	@GetMapping("/getProStudent")
	public List<Student> getAllStudent(){
		List<Student> list = service.getAllStudent();
		return list;
	}
	@DeleteMapping("/deleteProStu/{id}")
	public ResponseEntity<String> deleteData(@PathVariable int id){
		String string = service.deletestudent(id);
		
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		service.saveStudent(s);
		return "Student Updated";
	}
}
