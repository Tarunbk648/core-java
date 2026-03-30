class Bank {
 private int bankId;
 private String bankName;
 private String branch;
 private String ifsc;
 private double balance;
 private String accountType;
 private String customerName;

 public void setBankId(int bankId){
   this.bankId = bankId;
 }
 public int getBankId(){
   return this.bankId;
 }

 public void setBankName(String bankName){
   this.bankName = bankName;
 }
 public String getBankName(){
   return this.bankName;
 }

 public void setBranch(String branch){
   this.branch = branch;
 }
 public String getBranch(){
   return this.branch;
 }

 public void setIfsc(String ifsc){
   this.ifsc = ifsc;
 }
 public String getIfsc(){
   return this.ifsc;
 }

 public void setBalance(double balance){
   this.balance = balance;
 }
 public double getBalance(){
   return this.balance;
 }

 public void setAccountType(String accountType){
   this.accountType = accountType;
 }
 public String getAccountType(){
   return this.accountType;
 }

 public void setCustomerName(String customerName){
   this.customerName = customerName;
 }
 public String getCustomerName(){
   return this.customerName;
 }
}