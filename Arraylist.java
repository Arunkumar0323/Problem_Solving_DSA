package com.CSE2027.day1;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(17);
		list.add(46);
		list.add(50);
		list.add(10);
		list.add(76);
		list.add(10);
		list.add("hello");
		Object ob = list.get(0);
		int a = (Integer)ob;
		System.out.print(a);
}
}
