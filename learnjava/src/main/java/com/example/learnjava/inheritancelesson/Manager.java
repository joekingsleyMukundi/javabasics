package com.example.learnjava.inheritancelesson;

public class Manager extends  Employee{
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary()+10000;
    }

    @Override
    public int getId() {
        return super.getId()+10;
    }
}
