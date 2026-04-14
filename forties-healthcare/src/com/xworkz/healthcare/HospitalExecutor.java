package com.xworkz.healthcare;
import com.xworkz.healthcare.hospital.Hospital;
import com.xworkz.healthcare.doctor.Doctor;

public class HospitalExecutor {
    public static void main(String[] args) {
        Hospital hospital= new Hospital();
        Doctor doctor= new Doctor();
        doctor.setDoctorId(1233);
        doctor.setDoctorName("Dr.Harish");

        boolean ref = hospital.createDoctorDetails(doctor);
        System.out.println("Is data added:" +ref);
        //System.out.println("The doctor id is:" +doctor.getDoctorId());
        //System.out.println("The doctor name is:" +doctor.getDoctorName());

        hospital.getDetails();

    }


}
