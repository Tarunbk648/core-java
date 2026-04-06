class Amazon{
 AmazonSubscription amazonsubcription;
 
 public boolean createAmazonAccount( AmazonSubscription amazonsubcription){
	 boolean isAccountCreated=false;
	 boolean isIdValid=false;
	 boolean isNameValid=false;
	 boolean isEmailValid=false;
	 boolean isPhoneNumberValid=false;
	 boolean isAddressValid=false;
	 
	 
	 int id=amazonsubcription.getId();
	 if(id>0){
		 isIdValid=true;
	 }
	 
	 String customerName= amazonsubcription.getName();
	 if(customerName!=null && !customerName.isEmpty()){
		 isNameValid=true;
	 }
	 
	 String email=amazonsubcription.getEmail();
	 if(email!=null && !email.isEmpty()){
		 isEmailValid=true;
	 }
	 
	 long phoneNumber=amazonsubcription.getPhoneNumber();
	 if(phoneNumber!=0){
		 isPhoneNumberValid=true;
	 }
	 
	 String address=amazonsubcription.getAddress();
	 if(address!=null && !address.isEmpty()){
		 isAddressValid=true;
	 }
	 
	 if(isIdValid==true && isNameValid==true &&  isEmailValid==true &&  isPhoneNumberValid==true && isAddressValid==true){
		 this.amazonsubcription=amazonsubcription;
		 isAccountCreated=true;
	 }
	 return isAccountCreated;
 }
 
 public void getDetails(){
	 System.out.println("UserId:" +amazonsubcription.getId());
	 System.out.println("UserName:" +amazonsubcription.getName());
	 System.out.println("Email:" +amazonsubcription.getEmail());
	 System.out.println("PhoneNumber:" +amazonsubcription.getPhoneNumber());
	 System.out.println("Address:" +amazonsubcription.getAddress());
	 
 }
}
		 
		 
	