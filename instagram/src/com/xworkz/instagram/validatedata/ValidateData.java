package com.xworkz.instagram.validatedata;

import com.xworkz.instagram.registration.Registration;

public class ValidateData {
    Registration registration;

    public  boolean createAccount(Registration registration){
        boolean isAccountCreated=false;
        boolean isUserIdValid=false;
        boolean isUserFirstNameValid=false;
        boolean isUserLastNameValid=false;
        boolean isUserEmailValid=false;
        boolean isUserPassword=false;

        int userId= registration.getUserId();
        if(userId>0){
            isUserIdValid=true;
        }
        String userFirstName=registration.getFirstName();
        if(userFirstName!=null && !userFirstName.isEmpty()){
            isUserFirstNameValid=true;
        }
        String userLastName= registration.getLastName();
        if(userLastName!=null && !userLastName.isEmpty()){
            isUserLastNameValid=true;
        }
        String email=registration.getEmail();
        if(email!=null && !email.isEmpty()){
            isUserEmailValid=true;

        }
        String password= registration.getPassword();
        if(password!=null && !password.isEmpty()){
            isUserPassword=true;
        }
        if(isUserIdValid && isUserFirstNameValid &&  isUserLastNameValid && isUserEmailValid && isUserPassword){
            this.registration=registration;
            isAccountCreated=true;
        }
        return isAccountCreated;


    }

    public void getDetails(){
        System.out.println("USER REGISTRATION DETAILS");
        System.out.println(registration.getUserId());
        System.out.println(registration.getFirstName());
        System.out.println(registration.getLastName());
        System.out.println(registration.getEmail());
        System.out.println(registration.getPassword());

    }
}
