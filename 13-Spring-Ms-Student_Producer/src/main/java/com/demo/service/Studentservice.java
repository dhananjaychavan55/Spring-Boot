package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface Studentservice {

	public void saveStudent(Student s);

	public List<Student> getAllStudent();

	public  String deletestudent(int id);
}
