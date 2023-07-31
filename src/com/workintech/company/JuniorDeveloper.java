package com.workintech.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("Jr Developer starts to working");
        super.setSalary(2000);
    }
}
