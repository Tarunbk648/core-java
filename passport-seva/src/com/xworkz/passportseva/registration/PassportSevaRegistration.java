package com.xworkz.passportseva.registration;

public class PassportSevaRegistration {
    private int passportId;
    private String applicantName;
    private String dateOfBirth;
    private boolean residentOfIndia;
    private String gender;
    private String address;

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setResidentOfIndia(boolean residentOfIndia) {
        this.residentOfIndia = residentOfIndia;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public int getPassportId() {
        return passportId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    public boolean getResidentOfIndia(){
        return residentOfIndia;
    }
}
