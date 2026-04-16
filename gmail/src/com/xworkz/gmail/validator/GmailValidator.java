package com.xworkz.gmail.validator;

import com.xworkz.gmail.account.Account;

public class GmailValidator {
    Account[] account = new Account[2];
    int index;

    public boolean addAccountDetails(Account account){
        boolean isAccountCreated=false;
        boolean isAccountIdValid=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isPhoneNumberValid=false;

        int id= account.getAccountId();
        if(id>0){
            isAccountIdValid=true;
        }

        String firstName= account.getFirstName();
        if(firstName!=null && !firstName.isEmpty()){
            isFirstNameValid=true;
        }

        String lastName=account.getLastName();
        if(lastName!=null && !lastName.isEmpty()){
            isLastNameValid=true;
        }

        long phoneNumber=account.getPhoneNumber();
        if(phoneNumber>0){
            isPhoneNumberValid=true;
        }

        if(isAccountIdValid==true && isFirstNameValid==true && isLastNameValid==true && isPhoneNumberValid==true){
            this.account[index++]=account;
            isAccountCreated=true;

        }
        return isAccountCreated;
    }

    public boolean updateFirstNameById(String firstname, int id){
        boolean isFirstNameUpdated=false;
        if(id>0){
            for (int i = 0; i < account.length ; i++) {
                if(account[i]!=null && id==account[i].getAccountId()){
                    String name= account[i].getFirstName();
                    account[i].setFirstName(firstname);
                    System.out.println("The account Id is:" +id);
                    System.out.println("The first name:" +name+ " is updated to" +account[i].getFirstName());
                    isFirstNameUpdated=true;
                }

            }
        }
        return isFirstNameUpdated;
    }

    public boolean updateLastNameById(String lastname, int id){
        boolean isLastNameUpdated=false;
        if(id>0){
            for (int i = 0; i < account.length ; i++) {
                if(account[i]!=null && id==account[i].getAccountId()){
                    String name=account[i].getLastName();
                    account[i].setLastName(lastname);
                    System.out.println("The account id is:" +id);
                    System.out.println("The last name:" +name+ " is updated to " +account[i].getLastName());
                    isLastNameUpdated=true;

                }

            }
        }
        return isLastNameUpdated;
    }


    public void getLastNameById(int id){
        if(id>0){
            for (int i = 0; i < account.length; i++) {
                if(account[i]!=null && id==account[i].getAccountId()){
                    String lastname=account[i].getLastName();
                    System.out.println("Getting last name by using parameter as id:" +lastname);
                }

            }

        }
    }

    public void deleteFirstNameById(int id){
        if(id>0){
            for (int i = 0; i <account.length ; i++) {
                if(account[i]!=null && id==account[i].getAccountId()){
                    account[i].setFirstName(null);
                    System.out.println("First name deleted from id:" +id);
                }

            }
        }
    }

    public void getAllDetails() {
        for (Account account : account) {
            if (account != null) {
                System.out.println("=================================");
                System.out.println("Account Id:" + account.getAccountId());
                System.out.println("First Name:" + account.getFirstName());
                System.out.println("Last Name:" + account.getLastName());
                System.out.println("Phone Number:" + account.getPhoneNumber());
            }
        }
    }

}
