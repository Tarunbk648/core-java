package com.xworkz.singleton.singleton;

public class Singleton {
     private static Singleton  singleton = new Singleton();
    private Singleton(){
        System.out.println("Singleton Design Pattern!!!!");
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}


//
//
//        ──              ──────────────────────────────────────────────┐
//        │  s1 = Singleton.getSingleton()                              │
//        │  → Object created (constructor runs, SOP prints once)       │
//        │  → Instance returned to s1                                  │
//        │  → s1 now holds reference: @1a2b3c                         │
//        └──────────────────────────┬──────────────────────────────────┘
//                                   │
//                                   ▼
//        ┌─────────────────────────────────────────────────────────────┐
//        │  s2 = Singleton.getSingleton()                              │
//        │  → SAME instance returned (no constructor)                  │
//        │  → s2 now holds reference: @1a2b3c (SAME as s1)             │
//        └──────────────────────────┬──────────────────────────────────┘
//                                   │
//                                   ▼
//        ┌─────────────────────────────────────────────────────────────┐
//        │  System.out.println(s1)                                     │
//        │  → Prints address of s1: @1a2b3c                           │
//        │  → This is FIRST address print                              │
//        └──────────────────────────┬──────────────────────────────────┘
//                                   │
//                                   ▼
//        ┌─────────────────────────────────────────────────────────────┐
//        │  System.out.println(s2)                                     │
//        │  → Prints address of s2: @1a2b3c                           │
//        │  → This is SECOND address print                             │
//        │  → SAME address because s1 and s2 point to SAME object
