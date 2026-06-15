package com.CSE2027.day1;
class Constructor
{
    int id;
    String name;
    double salary;
    Constructor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
    public static void main(String[] args) {
        Constructor emp = new Constructor(101, "Anandhi", 35000);

        emp.display();
    }
}
