package com.xworkz.passportseva.validator;

import com.xworkz.passportseva.registration.PassportSevaRegistration;

public class PassportSevaValidator {
    PassportSevaRegistration passportSevaRegistration;

    public boolean createAccount(PassportSevaRegistration passportSevaRegistration){
        boolean isAccountCreated=false;
        boolean isPassportIdValid=false;
        boolean isApplicantNameValid=false;
        boolean isDateOfBirthValid=false;
        boolean isApplicantResidentOfIndia=false;
        boolean isGenderValid=false;
        boolean isAddressValid=false;

        int id= passportSevaRegistration.getPassportId();
        if(id>0){
            isPassportIdValid=true;
        }

        String applicantName= passportSevaRegistration.getApplicantName();
        if(applicantName!=null && !applicantName.isEmpty()){
            isApplicantNameValid=true;
        }

        String dateofbirth= passportSevaRegistration.getDateOfBirth();
        if(dateofbirth!=null && !dateofbirth.isEmpty()){
            isDateOfBirthValid=true;
        }

        boolean residentOfIndia= passportSevaRegistration.getResidentOfIndia();
        if(residentOfIndia==true){
            isApplicantResidentOfIndia=true;
        }

        String gender= passportSevaRegistration.getGender();
        if(gender!=null && !gender.isEmpty()){
            isGenderValid=true;
        }

        String address= passportSevaRegistration.getAddress();
        if(address!=null && !address.isEmpty()){
            isAddressValid=true;
        }

        if(isPassportIdValid==true && isApplicantNameValid==true && isApplicantResidentOfIndia==true  && isGenderValid==true  && isAddressValid==true ){
            this.passportSevaRegistration=passportSevaRegistration;
            isAccountCreated=true;
        }
        return isAccountCreated;
    }

    public void getDetails(){
        System.out.println("Passport Id:" +passportSevaRegistration.getPassportId());
        System.out.println("Applicant Name:" +passportSevaRegistration.getApplicantName());
        System.out.println("Date of Birth:"  +passportSevaRegistration.getDateOfBirth());
        System.out.println("Is resident of india:" +passportSevaRegistration.getResidentOfIndia());
        System.out.println("Applicant gender:" +passportSevaRegistration.getGender());
        System.out.println("Applicant address:"  +passportSevaRegistration.getAddress());

    }


}
