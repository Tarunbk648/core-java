package com.xworkz.healthcare.hospital;
import com.xworkz.healthcare.doctor.Doctor;

public class Hospital {
    Doctor doctors[] = new Doctor[2];
    int index;

    public boolean createDoctorDetails(Doctor doctor) {
        boolean isDataAdded = false;
        boolean isDoctorIdValid = false;
        boolean isDoctorName = false;
        boolean isDoctorDesignation = false;
        boolean isDoctorFeesValid = false;
        int doctorId = doctor.getDoctorId();
        if (doctorId > 0) {
            isDoctorIdValid = true;
        }

        String doctorName = doctor.getDoctorName();
        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorName = true;

        }
        String designation = doctor.getDesignation();
        if (designation != null && !designation.isEmpty()) {
            isDoctorDesignation = true;

        }
        String[] specialization = doctor.getSpecialization();
        if (specialization != null) {
            isDoctorDesignation = true;

        }
        int fees = doctor.getFees();
        if (fees > 0) {
            isDoctorFeesValid = true;
        }


        if (isDoctorIdValid == true && isDoctorName == true && isDoctorDesignation == true && isDoctorDesignation == true && isDoctorFeesValid == true) {
            this.doctors[index++] = doctor;
            isDataAdded = true;
        }
        return isDataAdded;

    }

    public boolean updateDoctorExperienceByName(String updateexp, String name) {
        boolean isDoctorExperienceUpdated = false;
        if (name != null && updateexp != null) {
            for (int i = 0; i < doctors.length; i++) {
                if (name.equals(doctors[i].getDoctorName())) {
                    String oldExperience = doctors[i].getExperience();
                    doctors[i].setExperience(updateexp);
                    System.out.println("The name of the doctor:" + doctors[i].getDoctorName());
                    System.out.println("The existing experience:" + oldExperience + "is updated to:" + doctors[i].getExperience());
                    isDoctorExperienceUpdated = true;
                }
            }
        }
        return isDoctorExperienceUpdated;
    }

    public boolean updateFeesByDoctorName(int updateFees, String name) {
        boolean isFeesUpdated = false;
        if (name != null && !name.isEmpty()) {
            for (int i = 0; i < doctors.length; i++) {
                if (name.equals(doctors[i].getDoctorName())) {
                    int Fees = doctors[i].getFees();
                    doctors[i].setFees(updateFees);
                    System.out.println("The doctor name:" + name);
                    System.out.println("The existing fees " + Fees + " is updated to" + doctors[i].getFees());
                    isFeesUpdated = true;
                }

            }
        }
        return isFeesUpdated;
    }

    public boolean updateDesignationByDoctorId(String updateDesignation, int doctorId) {
        boolean isDesignationUpdated = false;
        if (doctorId > 0 && updateDesignation != null) {
            for (int i = 0; i < doctors.length; i++) {
                if (doctorId == doctors[i].getDoctorId()) {
                    String oldDesignation = doctors[i].getDesignation();
                    doctors[i].setDesignation(updateDesignation);
                    System.out.println("The Doctor name:" + doctors[i].getDoctorName() + " with id " + doctorId);
                    System.out.println("The old designation: " + oldDesignation + " is updated to " + doctors[i].getDesignation());
                    isDesignationUpdated = true;

                }


            }
        } else System.out.println("INVALID DOCTOR ID");
        return isDesignationUpdated;
    }

    public boolean updateFeesByDoctorId(int fees, int id) {
        boolean isFeesUpdated = false;
        if (fees > 0 && id > 0) {
            for (int i = 0; i < doctors.length; i++) {
                if (id == doctors[i].getDoctorId()) {
                    int fee = doctors[i].getFees();
                    doctors[i].setFees(fees);
                    System.out.println("The doctor with the id:" + id);
                    System.out.println("The old fees:" + fee + " is updated to " + doctors[i].getFees());
                    isFeesUpdated = true;
                }

            }
        }
        return isFeesUpdated;
    }

    public boolean updateDesignationByDoctorName(String designation, String doctorname) {
        boolean isDesignationUpdated = false;
        if (designation != null && doctorname != null) {
            for (int i = 0; i < doctors.length; i++) {
                if (doctorname.equals(doctors[i].getDoctorName())) {
                    String oldDesignation = doctors[i].getDesignation();
                    doctors[i].setDesignation(designation);
                    System.out.println("The Doctor name:" + doctorname);
                    System.out.println("The old designation:" + oldDesignation + " is updated to " + doctors[i].getDesignation());
                    isDesignationUpdated = true;
                }

            }
        }
        return isDesignationUpdated;
    }

    public void getDesignationByDoctorname(String name) {
        if (name != null && !name.isEmpty()) {
            for (int i = 0; i < doctors.length; i++) {
                if (name.equals(doctors[i].getDoctorName())) {
                    String designation = doctors[i].getDesignation();
                    System.out.println("The Doctor name:" + name + " his designation:" + designation);

                }
            }


        } else System.out.println("INVALID NAME");
    }

    public void getFeesByDoctorId(int id) {
        if (id > 0) {
            for (int i = 0; i < doctors.length; i++) {
                if (id == doctors[i].getDoctorId()) {
                    int fees = doctors[i].getFees();
                    System.out.println("The Doctor Id:" + id + " his fees " + fees);
                }

            }


        } else System.out.println("INVALID ID");
    }

    public void getSpecializationById(int id) {
        if (id > 0) {
            for (int i = 0; i < doctors.length; i++) {
                if (id == doctors[i].getDoctorId()) {
                    System.out.println("The Doctor Id: "+id+ " his specialization ");
                    for (String specialization : doctors[i].getSpecialization()) {
                        System.out.println(specialization + " ");
                    }
                }

            }


        }
    }


        public void getDetails () {
            for (Doctor doctors : doctors) {
                if (doctors != null) {
                    System.out.println("=============================");
                    System.out.println("Doctor Id is:" + doctors.getDoctorId());
                    System.out.println("Doctor name:" + doctors.getDoctorName());
                    System.out.println("Doctor designation:" + doctors.getDesignation());
                    System.out.println("Doctor experience:" + doctors.getExperience());
                    System.out.println("DOCTOR SPECIALIZATION");
                    for (String specialization : doctors.getSpecialization()) {
                        System.out.println(specialization);
                    }
                    System.out.println("Doctor fees:" + doctors.getFees());
                }
            }
        }
    }


