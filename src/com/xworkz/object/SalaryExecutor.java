package com.xworkz.object;

public class SalaryExecutor {
    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.Details(1, "Tarun");

        System.out.println(salary.toString());

        Salary salary1= new Salary();
        System.out.println(salary1);
        salary1.Details(10, "arun");
        System.out.println(salary1.toString());

        System.out.println(salary==salary1);
        System.out.println(salary.equals(salary1));

        System.out.println(salary.hashCode());
        System.out.println(salary1.hashCode());
    }
}
