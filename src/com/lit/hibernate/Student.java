package com.lit.hibernate;

public class Student 
{
	private int roll;
	private String name;
	private double cgpa;
	
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name, double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
}
