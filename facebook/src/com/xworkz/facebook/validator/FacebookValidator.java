package com.xworkz.facebook.validator;

import com.xworkz.facebook.facebook.UserAccount;

public class FacebookValidator {
    UserAccount useraccount;

    public boolean createAccount(UserAccount useraccount){
        boolean isAccountCreated=false;
        boolean isIdValid=false;
        boolean isUserNameValid=false;
        boolean isEmailValid=false;
        boolean isPasswordValid=false;
        boolean isPhoneNumberValid=false;
        boolean isGenderValid=false;

        int id= useraccount.getId();
        if(id>0){
            isIdValid=true;
        }
        String name= useraccount.getUserName();
        if(name!=null && !name.isEmpty()){
            isUserNameValid=true;
        }

        String email=useraccount.getEmail();
        if(email!=null && !email.isEmpty()){
            isEmailValid=true;
        }
        String password= useraccount.getPassword();
        if(password!=null && !password.isEmpty()){
            isPasswordValid=true;
        }

        String phoneNumber=useraccount.getPhoneNumber();
        if(phoneNumber!=null && !phoneNumber.isEmpty()){
            isPhoneNumberValid=true;
        }
        String gender= useraccount.getGender();
        if(gender!=null && !gender.isEmpty()){
            isGenderValid=true;
        }

        if( isIdValid==true && isUserNameValid==true && isEmailValid==true && isPasswordValid==true && isGenderValid==true ){
            this.useraccount=useraccount;
            isAccountCreated=true;
        }
        return isAccountCreated;
    }

    public void getDetails(){
        System.out.println("UserId:" +useraccount.getId());
        System.out.println("UserName:" +useraccount.getUserName());
        System.out.println("Email:" +useraccount.getEmail());
        System.out.println("Password:" +useraccount.getPassword());
        System.out.println("PhoneNumber:" +useraccount.getPhoneNumber());
        System.out.println("Gender:" +useraccount.getGender());
    }

}
