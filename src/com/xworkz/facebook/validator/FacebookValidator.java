package com.xworkz.facebook.validator;

import com.xworkz.facebook.facebook.UserAccount;

public class FacebookValidator  {
    UserAccount[] useraccount=new UserAccount[3];
    int index;

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
        System.out.println(isIdValid);
        System.out.println(isUserNameValid);
        System.out.println(isEmailValid);
        System.out.println(isPasswordValid);
        System.out.println(isGenderValid);

        if( isIdValid==true && isUserNameValid==true && isEmailValid==true && isPasswordValid==true && isGenderValid==true ){
            this.useraccount[index++]=useraccount;
            isAccountCreated=true;
        }
        return isAccountCreated;
    }

    public void getDetails() {
        try {
            for (UserAccount userAccount : useraccount) {
                System.out.println("---------------------------");
                System.out.println("UserId:" + userAccount.getId());
                System.out.println("UserName:" + userAccount.getUserName());
                System.out.println("Email:" + userAccount.getEmail());
                System.out.println("Password:" + userAccount.getPassword());
                System.out.println("PhoneNumber:" + userAccount.getPhoneNumber());
                System.out.println("Gender:" + userAccount.getGender());
            }

        } catch (Exception e) {
            System.err.println("GetDetails become null because one of the method is not setting at all!!");
        }
    }
}
