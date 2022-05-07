package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements Studentservice {

	@Autowired
	private StudentDao repo;
	
	@Override
	public void saveStudent(Student s) {
		repo.save(s);
		
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = repo.findAll();
		
		return list;
		
	}

	@Override
	public String deletestudent(int id) {
		
				repo.deleteById(id);
		return "Data Delete With Id = "+id;
	}

}
