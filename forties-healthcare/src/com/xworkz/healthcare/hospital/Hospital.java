package com.xworkz.healthcare.hospital;
import com.xworkz.healthcare.doctor.Doctor;

public class Hospital {
    Doctor doctor;

    public boolean createDoctorDetails(Doctor doctor){
        boolean isDataAdded=false;
        boolean isDoctorIdValid=false;
        boolean isDoctorName=false;
        int doctorId=doctor.getDoctorId();
        if(doctorId>0){
            isDoctorIdValid=true;
        }

        String doctorName=doctor.getDoctorName();
        if(doctorName!=null && !doctorName.isEmpty()){
            isDoctorName=true;

        }
        if(isDoctorIdValid==true && isDoctorName==true ){
            this.doctor=doctor;
            isDataAdded=true;
        }
        return isDataAdded;

    }
    public void getDetails(){
         System.out.println("Doctor Id is:" +doctor.getDoctorId());
         System.out.println("Doctor name:" +doctor.getDoctorName());
    }
}
