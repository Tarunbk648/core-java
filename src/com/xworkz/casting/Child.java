package com.xworkz.casting;

public class Child extends Parent{

    @Override
    public  void doBusiness(){
        System.out.println("Perform Sandlewood Business!!");
    }

    public void Details(){
        System.out.println("Child shares the information to parent by dowm casting!!");
    }


}
