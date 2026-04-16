package com.xworkz.gmail;

import com.xworkz.gmail.account.Account;
import com.xworkz.gmail.validator.GmailValidator;

public class GmailExecutor {
    public static void main(String[] args) {
        GmailValidator gmailValidator = new GmailValidator();
        Account account = new Account();
        account.setAccountId(10778);
        account.setFirstName("Harish");
        account.setLastName("H U");
        account.setPhoneNumber(97656478893L);
        gmailValidator.addAccountDetails(account);

        Account account1 = new Account();
        account1.setAccountId(20335);
        account1.setFirstName("Tarun");
        account1.setLastName("B K");
        account1.setPhoneNumber(976546783L);
        gmailValidator.addAccountDetails(account1);

        System.out.println();
        gmailValidator.updateFirstNameById("Kiran", 10778);

        System.out.println();
        gmailValidator.updateLastNameById("K M", 10778);

        System.out.println();
        gmailValidator.getLastNameById(20335);


        System.out.println();
        gmailValidator.deleteFirstNameById(20335);

        gmailValidator.getAllDetails();





    }

}
