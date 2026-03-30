class BankExecutor {
 public static void main(String[] args){

    Bank b1 = new Bank();
    b1.setBankId(1);
    System.out.println("Bank Id:" +b1.getBankId());
    b1.setBankName("SBI");
    System.out.println("Bank Name:" +b1.getBankName());
    b1.setBranch("Bangalore");
    System.out.println("Branch:" +b1.getBranch());
    b1.setIfsc("SBIN0001");
    System.out.println("IFSC:" +b1.getIfsc());
    b1.setBalance(50000);
    System.out.println("Balance:" +b1.getBalance());
    b1.setAccountType("Savings");
    System.out.println("Account Type:" +b1.getAccountType());
    b1.setCustomerName("Harsha");
    System.out.println("Customer:" +b1.getCustomerName());

    System.out.println();
    Bank b2 = new Bank();
    b2.setBankId(2);
    System.out.println("Bank Id:" +b2.getBankId());
    b2.setBankName("HDFC");
    System.out.println("Bank Name:" +b2.getBankName());
    b2.setBranch("BTM Layout");
    System.out.println("Branch:" +b2.getBranch());
    b2.setIfsc("HDFC0002");
    System.out.println("IFSC:" +b2.getIfsc());
    b2.setBalance(75000);
    System.out.println("Balance:" +b2.getBalance());
    b2.setAccountType("Current");
    System.out.println("Account Type:" +b2.getAccountType());
    b2.setCustomerName("Lohith");
    System.out.println("Customer:" +b2.getCustomerName());

    System.out.println();
    Bank b3 = new Bank();
    b3.setBankId(3);
    System.out.println("Bank Id:" +b3.getBankId());
    b3.setBankName("ICICI");
    System.out.println("Bank Name:" +b3.getBankName());
    b3.setBranch("Chennai");
    System.out.println("Branch:" +b3.getBranch());
    b3.setIfsc("ICIC0003");
    System.out.println("IFSC:" +b3.getIfsc());
    b3.setBalance(60000);
    System.out.println("Balance:" +b3.getBalance());
    b3.setAccountType("Savings");
    System.out.println("Account Type:" +b3.getAccountType());
    b3.setCustomerName("Kiran");
    System.out.println("Customer:" +b3.getCustomerName());

    System.out.println();
    Bank b4 = new Bank();
    b4.setBankId(4);
    System.out.println("Bank Id:" +b4.getBankId());
    b4.setBankName("Axis");
    System.out.println("Bank Name:" +b4.getBankName());
    b4.setBranch("Hyderabad");
    System.out.println("Branch:" +b4.getBranch());
    b4.setIfsc("AXIS0004");
    System.out.println("IFSC:" +b4.getIfsc());
    b4.setBalance(82000);
    System.out.println("Balance:" +b4.getBalance());
    b4.setAccountType("Savings");
    System.out.println("Account Type:" +b4.getAccountType());
    b4.setCustomerName("Suresh");
    System.out.println("Customer:" +b4.getCustomerName());

    System.out.println();
    Bank b5 = new Bank();
    b5.setBankId(5);
    System.out.println("Bank Id:" +b5.getBankId());
    b5.setBankName("Canara");
    System.out.println("Bank Name:" +b5.getBankName());
    b5.setBranch("Delhi");
    System.out.println("Branch:" +b5.getBranch());
    b5.setIfsc("CNRB0005");
    System.out.println("IFSC:" +b5.getIfsc());
    b5.setBalance(45000);
    System.out.println("Balance:" +b5.getBalance());
    b5.setAccountType("Current");
    System.out.println("Account Type:" +b5.getAccountType());
    b5.setCustomerName("Ravi");
    System.out.println("Customer:" +b5.getCustomerName());
 }
}