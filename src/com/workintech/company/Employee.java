package com.workintech.company;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: " + id);
        builder.append(" Name: " + name);
        return builder.toString();
    }

}
