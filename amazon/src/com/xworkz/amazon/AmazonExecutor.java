package com.xworkz.amazon;

import com.xworkz.amazon.amazon.Amazon;
import com.xworkz.amazon.validator.AmazonValidator;

public class AmazonExecutor {
    public static void main(String[] args) {
        AmazonValidator amazonValidator= new AmazonValidator();
        Amazon amazon = new Amazon();
        amazon.setAccountId(101);
        amazon.setCustomerName("Harish");
        amazon.setEmail("Harish@gmail.com");
        amazon.setPhoneNumber(97310362577L);
        amazon.setAddress("Rajajinagar");

        boolean ref= amazonValidator.createAmazonAccount(amazon);
        System.out.println("Is account created:" +ref);

        amazonValidator.getDetails();


    }
}
