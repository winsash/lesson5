package com.company;

public class Employee {
    private String fullname;
    private String state;
    private String email;
    private int phone;
    private double salary;
    private int age;

    public Employee(String fullname, String state, String email, int phone, double salary, int age) {
        this.fullname = fullname;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.printf("Fullname: %s%n State: %s%n E-mail: %s%n Phone: %s%n Salary: %s%n Age: %d%n", fullname, state, email, phone, salary, age);
    }

}
