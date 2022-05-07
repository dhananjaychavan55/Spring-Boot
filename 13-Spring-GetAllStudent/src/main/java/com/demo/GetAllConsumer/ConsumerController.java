package com.demo.GetAllConsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Student;

@RestController
@RequestMapping("/getAllConsumer")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/check")
	public String check() {
		return "GetAllStudent Consumer Working";
	}
	@GetMapping("/getAllCosumeData")
	public List<Student> getAllProduceData() {
		System.out.println("getALlConsumedata");
		String url="http://zuul/getPro/ProdApi/getProStudent";
	//	http://zuul/getPro/ProdApi/getProStudent
		System.out.println("getALlConsumedata");
	
		List<Student> slist = (List<Student>)restTemplate.getForObject(url, Object.class);
								
		System.out.println("getALlConsumedata");
		System.out.println(slist);
		return slist;
		
	}
	
}
