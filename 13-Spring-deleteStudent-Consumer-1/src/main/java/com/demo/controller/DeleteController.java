package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController @RequestMapping("/deleteApi")
public class DeleteController {

	
	@Autowired
	private RestTemplate template;
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		String url="http://zuul/getPro/ProdApi/deleteProStu/"+id;
		template.delete(url, id);
		return "data Delete with id= "+id ;
	}
}
