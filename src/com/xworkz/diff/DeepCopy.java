package com.xworkz.diff;

public class DeepCopy {
    String name;
    DeepCopy(String n){
        this.name=n;
    }
    public static void main(String[] args) {
        DeepCopy deepcopy= new DeepCopy("Tarun");
        DeepCopy deepCopy1=new DeepCopy(deepcopy.name);  //Both deepcopy and deepcopy1 points to a different object(reference)
        deepCopy1.name="Varun";
        System.out.println(deepcopy.hashCode());
        System.out.println(deepCopy1.hashCode());
        System.out.println();

        System.out.println(deepcopy.name);
        System.out.println(deepCopy1.name);

        //changes added to github

    }
}
