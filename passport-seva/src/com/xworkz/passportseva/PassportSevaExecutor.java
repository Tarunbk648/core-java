package com.xworkz.passportseva;

import com.xworkz.passportseva.registration.PassportSevaRegistration;
import com.xworkz.passportseva.validator.PassportSevaValidator;

public class PassportSevaExecutor {
    public static void main(String[] args) {
        PassportSevaValidator passportSevaValidator= new PassportSevaValidator();
        PassportSevaRegistration passportSevaRegistration= new PassportSevaRegistration();
        passportSevaRegistration.setPassportId(10887);
        passportSevaRegistration.setApplicantName("Tarun");
        passportSevaRegistration.setDateOfBirth("04/5/2004");
        passportSevaRegistration.setResidentOfIndia(true);
        passportSevaRegistration.setGender("male");
        passportSevaRegistration.setAddress("Rajajinagar");

        boolean ref=passportSevaValidator.createAccount(passportSevaRegistration);
        System.out.println("Is Passport Registration Successful:" +ref);

        passportSevaValidator.getDetails();
    }
}
