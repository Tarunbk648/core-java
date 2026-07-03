package com.xworkz.singleton;

import com.xworkz.singleton.singleton.Singleton;

public class SingletonRunner {
    public static void main(String[] args) {

        Singleton s1=Singleton.getSingleton();
        Singleton s2= Singleton.getSingleton();

        System.out.println(s1);   //same object
        System.out.println(s2);   //same object
    }
}


