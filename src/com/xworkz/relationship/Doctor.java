package com.xworkz.relationship;

public class Doctor {
    int Doctor_Id;
    String Doctor_Name;
    Patient patient;

    Doctor(int id, String name, Patient patient){
        this.Doctor_Id=id;
        this.Doctor_Name=name;
        this.patient=patient;
    }
    public void getDetails(){
        System.out.println("-------------------------------");
        System.out.println("Fetching Doctor Details");
        System.out.println("Doctor Id:" +this.Doctor_Id);
        System.out.println("Doctor Name:" +this.Doctor_Name);
        this.patient.getDetails();
    }
}
