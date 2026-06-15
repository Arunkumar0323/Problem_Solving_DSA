package com.CSE2027.day1;
import java.util.*;

public class Inheritance {

    class KGiSL {
        String college_name = "KGiSL";

        void KGiSL() {
            System.out.println("College Name: " + college_name);
        }
    }

    class Student extends KGiSL {
        String name;
        String dept;
        String sec;
        int age;

        void skill() {
            System.out.println("I am cricketer");
        }

        void showDetails() {
            super.KGiSL();   
            System.out.println("Name: " + name);
            System.out.println("Department: " + dept);
            System.out.println("Section: " + sec);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter department: ");
        String dept = input.nextLine();

        System.out.print("Enter section: ");
        String sec = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();
        Inheritance obj = new Inheritance();
        Student var = obj.new Student(); 
        var.name = name;
        var.dept = dept;
        var.sec = sec;
        var.age = age;

        var.showDetails();
        var.skill();
    }
}
