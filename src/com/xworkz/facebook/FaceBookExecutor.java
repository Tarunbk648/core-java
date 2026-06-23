package com.xworkz.facebook;

import com.xworkz.facebook.facebook.UserAccount;
import com.xworkz.facebook.validator.FacebookValidator;

public class FaceBookExecutor {
    public static void main(String[] args) {
        FacebookValidator facebookValidator = new FacebookValidator();
        try {
            UserAccount userAccount = new UserAccount();

            UserAccount ref = userAccount.clone();  //clone()--> doesn't use useraccount constructor for copy creation rather then that bypass the constructor (means reference)----> means in technical----->Copies an existing object without invoking a constructor, provided the class implements Cloneable.
            ref.setId(1022);
            ref.setGender("Male");
            ref.setPhoneNumber("9731036881");
            ref.setUserName("Tarun");
            ref.setEmail("tarun@gmail.com");
            ref.setPassword("T123");
            facebookValidator.createAccount(ref);

            UserAccount ref1 = userAccount.clone();
            ref1.setId(1023);
            ref1.setUserName("Ruthik");
            ref1.setGender("Male");
            ref1.setEmail("Ruthik@gmail.com");
            ref1.setPassword("R123");
            ref1.setPhoneNumber("8754361045");
            facebookValidator.createAccount(ref1);

            UserAccount ref2=userAccount.clone();
            ref2.setId(1024);
            ref2.setUserName("Ramnath");
            ref2.setPhoneNumber("6363542810");
            ref2.setGender("Male");
            ref2.setPassword("R789");
            ref2.setEmail("ramnath@gmail.com");
            facebookValidator.createAccount(ref2);
        }
        catch (CloneNotSupportedException e) {
            System.err.println("Clonable methods is not implemented in a UseAccount!!!");
        }


        facebookValidator.getDetails();
    }

}
