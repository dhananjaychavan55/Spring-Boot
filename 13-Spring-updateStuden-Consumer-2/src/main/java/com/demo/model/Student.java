package com.demo.model;


public class Student {

	
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addres=" + addres + ", marks=" + marks + ", age="
				+ age + "]";
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private String addres;
	private double marks;
	private int age;
	
}
