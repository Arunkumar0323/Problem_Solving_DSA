package com.CSE2027.day1;

	class Person {
	    String name;
	    int age;

	    void setPerson(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Student extends Person {
	    int rollNo;

	    void setStudent(String name, int age, int rollNo) {
	        setPerson(name, age);   
	        this.rollNo = rollNo;
	    }

	    void display() {
	        System.out.println("Name   : " + name);
	        System.out.println("Age    : " + age);
	        System.out.println("RollNo : " + rollNo);
	    }

	    public static void main(String[] args) {
	        Student s = new Student();
	        s.setStudent("Anandhi", 20, 101);
	        s.display();
	    }
	}

