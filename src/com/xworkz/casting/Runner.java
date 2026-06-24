package com.xworkz.casting;

public class Runner {
    public static  void main(String[] args) {
        Parent parent1=new Parent();   //Normal parent object creation (upcasting)
        parent1.doBusiness();
        System.out.println("----------");

//        Parent p=new Parent();
//        p.Details();   //cannot find symbol
//        System.out.println("----------");


        Child child=new Child();      //Normal child object creation (upcasting)
        child.doBusiness();
        System.out.println("----------");


        Parent parent= new Child();   //Polymorphism  (upcasting)
        parent.doBusiness();
        System.out.println("----------");

        Child child1=(Child) parent;  //Polymorphism (downcasting) "accessing a child method using a parent reference"
        child1.Details();
        child1.doBusiness();
        System.out.println("-----------");









    }
}
