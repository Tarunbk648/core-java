package com.xworkz.healthcare;
import com.xworkz.healthcare.hospital.Hospital;
import com.xworkz.healthcare.doctor.Doctor;

import java.sql.SQLOutput;

public class HospitalExecutor {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1233);
        doctor.setDoctorName("Dr.Harish");
        doctor.setExperience("44");
        doctor.setDesignation("Cardiologist");
        doctor.setFees(1200);
        String[] specialization = {"cardiologist", "neurologist"};
        doctor.setSpecialization(specialization);
        hospital.createDoctorDetails(doctor);

        Doctor doctor1 = new Doctor();
        doctor1.setDoctorId(1400);
        doctor1.setDoctorName("Dr.Dinesh");
        doctor1.setExperience("20");
        doctor1.setDesignation("Neurologist");
        doctor1.setFees(1200);
        String[] specialization1 = {"Eyespecialist", "neurologist"};
        doctor1.setSpecialization(specialization1);
        hospital.createDoctorDetails(doctor1);


        System.out.println();
        hospital.updateDoctorExperienceByName("49", "Dr.Harish");

        System.out.println();
        hospital.updateFeesByDoctorName(2800, "Dr.Dinesh");

        System.out.println();
        hospital.updateDesignationByDoctorId("Dermotologist", 1400);

        System.out.println();
        hospital.updateFeesByDoctorId(3800, 1400);

        System.out.println();
        hospital.updateDesignationByDoctorName("Neurologist", "Dr.Dinesh");

        System.out.println();
        hospital.getDesignationByDoctorname("Dr.Dinesh");

        System.out.println();
        hospital.getFeesByDoctorId(1400);

        System.out.println();
        hospital.getSpecializationById(1233);

//        hospital.getDetails();


    }


}
