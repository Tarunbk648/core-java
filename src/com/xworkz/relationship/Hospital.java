package com.xworkz.relationship;

public class Hospital {
    int Hospital_Id;
    String Hospital_Name;
    Doctor doctor;

    Hospital(int id, String name, Doctor doctor){
        this.Hospital_Id=id;
        this.Hospital_Name=name;
        this.doctor=doctor;
    }

    public void getDetails(){
        System.out.println("-------------------------------");
        System.out.println("Fetching Hospital Details");
        System.out.println("Hospital Id:" +this.Hospital_Id);
        System.out.println("Hospital Name:" +this.Hospital_Name);
        this.doctor.getDetails();
    }
}
