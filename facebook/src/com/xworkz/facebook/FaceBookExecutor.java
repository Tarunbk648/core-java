package com.xworkz.facebook;

import com.xworkz.facebook.facebook.UserAccount;
import com.xworkz.facebook.validator.FacebookValidator;

public class FaceBookExecutor {
    public static void main(String[] args) {
        FacebookValidator facebookValidator = new FacebookValidator();
        UserAccount userAccount= new UserAccount();
        System.out.println(userAccount.getId());
        userAccount.setId(1022);
        System.out.println(userAccount.getUserName());
        userAccount.setUserName("Kavan");
        userAccount.setEmail("Kavan@gmail.com");
        userAccount.setPassword("Kavan123.");
        userAccount.setPhoneNumber("9731036881");
        userAccount.setGender("male");


        boolean ref=facebookValidator.createAccount(userAccount);
        System.out.println("Is account created:" +ref) ;

        facebookValidator.getDetails();
    }

}
