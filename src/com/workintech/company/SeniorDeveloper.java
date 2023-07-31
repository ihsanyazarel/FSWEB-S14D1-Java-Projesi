package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("Sr Developer starts to working");
        super.setSalary(4000);
    }
}
