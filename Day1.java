package com.CSE2027.day1;

public class Day1 {
	 int rollno = 123;
	String name;
	 void CGPA() {
		System.out.println("CGPA is 8");
		
	}
	public static void main(String[]args) {
		System.out.println("hello_arun!!");
		System.out.println(args[1]);
		Day1 obj = new Day1();
		obj.CGPA();
		obj.rollno=123;
		obj.name="Arun";
		System.out.println(obj.rollno);
	}

}
