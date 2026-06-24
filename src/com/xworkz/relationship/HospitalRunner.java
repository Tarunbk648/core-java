package com.xworkz.relationship;

public class HospitalRunner {
    public static void main(String[] args) {
       Patient patient=new Patient(123, "Harish", "Male");
       Doctor doctor=new Doctor(6788,"Dr.Rajesh" ,patient);
       Hospital hospital=new Hospital(78990, "Forties Hospital", doctor);
       hospital.getDetails();
    }
}
