package com.tca;

import com.tca.entities.Student;

public class Demo {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"AAA", 60);
		
		Student s2 = new Student();
		s2.setRno(102);
		s2.setName("BBB");
		s2.setPer(70);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Roll Number : " +  s1.getRno());
		System.out.println("Name        : " +  s1.getName());
		System.out.println("Percentage  : " +  s1.getPer());
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Roll Number : " +  s2.getRno());
		System.out.println("Name        : " +  s2.getName());
		System.out.println("Percentage  : " +  s2.getPer());
	}

}
