class Facebook{
  UserAccount userAccount;
  public boolean createUserAccount(UserAccount userAccount){
     boolean isUserAccoountCreated=false;
	 boolean isUserIdValid=false;
	 boolean isUserNameCreated=false;
	 boolean isEmailCreated=false;
	 boolean isPasswordCreated=false;
	 boolean isPhoneNumberCreated=false;
	 boolean isGenderCreated=false;
	 
	 int id= userAccount.getId();
	 if(id>0){
	   isUserIdValid=true;
	   }
	  String username=userAccount.getUserName();
	  if(username!=null && !username.isEmpty()){
	      isUserNameCreated=true;
		  }
	  String email=userAccount.getEmail();
	  if(email!=null && !email.isEmpty()){
	      isEmailCreated=true;
		  }
	  String password=userAccount.getPassword();
	  if(email!=null && !email.isEmpty()){
	      isPasswordCreated=true;
		 }
	  String phoneNumber=userAccount.getPhoneNumber();
	  if(phoneNumber!=null && !phoneNumber.isEmpty()){
	      isPhoneNumberCreated=true;
		 }
	  String gender=userAccount.getGender();
	  if(gender!=null && !gender.isEmpty()){
	      isGenderCreated=true;
		 }
	 if(isUserIdValid==true && isUserNameCreated==true &&   isEmailCreated==true &&  isPasswordCreated==true && isPhoneNumberCreated==true && isGenderCreated==true){
		   
			this.userAccount = userAccount;
			isUserAccoountCreated=true;
	 }
	return isUserAccoountCreated;
}

public void getDetails(){
	 if(userAccount!=null){
		System.out.println("UserID:" +userAccount.getId());
		System.out.println("UserName:" +userAccount.getUserName());
		System.out.println("Email:" +userAccount.getEmail());
		System.out.println("Password:" +userAccount.getPassword());
		System.out.println("Gender:" +userAccount.getGender());
	 }
}
}
	     