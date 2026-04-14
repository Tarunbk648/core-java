package com.xworkz.instagram;

import com.xworkz.instagram.registration.Registration;
import com.xworkz.instagram.validatedata.ValidateData;

public class InstagramExecutor {
    public static void main(String[] args) {
        ValidateData validateData= new ValidateData();
        Registration registration=new Registration();
        registration.setUserId(1);
        registration.setFirstName("Tarun");
        registration.setLastName("B K");
        registration.setEmail("tarun1947@gmail.com");
        registration.setPassword("Tarun&2345.");

        boolean ref =validateData.createAccount(registration);
        System.out.println("Is data created:" +ref);

        validateData.getDetails();
    }


}
