package com.xworkz.diff;

public class ShallowExceutor {
    String name;
    ShallowExceutor(String n){
        this.name=n;
    }
    public static void main(String[] args) {

        ShallowExceutor s1=new ShallowExceutor("Tarun");
        ShallowExceutor s2=s1;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());  //both s1 and s2 points to the same object

        s2.name="Varun";  //so both variable points to the same object try to change the one object which will effect the other
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
