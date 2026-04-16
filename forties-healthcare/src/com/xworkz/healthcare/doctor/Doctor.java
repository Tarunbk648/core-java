package com.xworkz.healthcare.doctor;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String designation;
    private String experience;
    private String specialization[];
    private int fees;

    public void setDoctorId(int doctorId) {

        this.doctorId = doctorId;
    }

    public void setDoctorName(String doctorName) {

        this.doctorName = doctorName;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public void setSpecialization(String[] specialization) {

        this.specialization = specialization;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public int getFees() {
        return fees;
    }

    public String getDesignation() {
        return designation;
    }

    public String[] getSpecialization() {
        return specialization;
    }

    public String getExperience() {
        return experience;
    }
}
