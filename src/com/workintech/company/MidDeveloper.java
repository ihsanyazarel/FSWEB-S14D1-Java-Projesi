package com.workintech.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("Mid Developer starts to working");
        super.setSalary(3000);
    }
}
