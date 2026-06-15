package com.CSE2027.day1;

public class Encap {
	private int a;
	//private int b;
	
	void setA(int b) {
		this.a=b;
		
	}
	 int getA() {
		return a;
	}

	public static void main(String[] args) {
		
		Encap s1 = new Encap();
		s1.setA(30);
		System.out.println(s1.getA());

	}

}
