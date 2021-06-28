package com.example.learnjava.inheritancelesson;

public class MyC {
    //inctanciating  the person class
    public static void main(String[] args) {
        Person james = new Person("james",37,"mukundi");
        System.out.println(james);
       int age =  james.getAge();
        System.out.println(age);
        //inctanciating employee
        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setLastName("stones");
        emp1.setAge(23);
        emp1.setId(23997421);
        emp1.setAnnualSalary(12300000);
        System.out.println(emp1.getName());

        Manager manager =new Manager();
        manager.setName("john");
        manager.setLastName("doe");
        manager.setAge(27);
        manager.setId(345526);
        manager.setAnnualSalary(20000000);

        System.out.println(manager.getAnnualSalary());
        System.out.println(manager.getName());
    }
}
