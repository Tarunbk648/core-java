package com.xworkz.amazon.validator;

import com.xworkz.amazon.amazon.Amazon;

public class AmazonValidator {
    Amazon amazon;

    public boolean createAmazonAccount(Amazon amazon) {
        boolean isAccountCreated = false;
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isAddressValid = false;

        int id = amazon.getAccountId();
        if (id > 0) {
            isIdValid = true;
        }
        String name = amazon.getCustomerName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }
        String email = amazon.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }
        long phoneNumber = amazon.getPhoneNumber();
        if (phoneNumber > 0) {
            isPhoneNumberValid = true;
        }

        String address = amazon.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }
        if (isIdValid == true && isNameValid == true && isEmailValid == true && isPhoneNumberValid == true && isAddressValid == true) {
            this.amazon = amazon;
            isAccountCreated = true;
        }
        return isAccountCreated;

    }

    public void getDetails(){
        System.out.println("Account Id:"  +amazon.getAccountId());
        System.out.println("Customer Name:" +amazon.getCustomerName());
        System.out.println("Customer Email:" +amazon.getEmail());
        System.out.println("Customer phoneNumber:" +amazon.getPhoneNumber());
        System.out.println("Customer Address:" +amazon.getAddress());


    }



}
