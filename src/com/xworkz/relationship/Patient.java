package com.xworkz.relationship;

public class Patient {
    int patient_id;
    String patient_name;
    String gender;

    Patient(int id, String name, String gender){
        this.patient_id=id;
        this.patient_name=name;
        this.gender=gender;
    }

    public void getDetails(){
        System.out.println("-------------------------------");
        System.out.println("Fetching Patient Details");
        System.out.println("Patient Id:" +this.patient_id);
        System.out.println("Patient Name:" +this.patient_name);
        System.out.println("Patient Gender:" +this.gender);
    }
}
