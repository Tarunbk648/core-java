class Facebook{
  UserAccount userAccount[]= new UserAccount[19];
  int index;
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
		   
			this.userAccount[index] = userAccount;
			index++;
			isUserAccoountCreated=true;
	 }
	return isUserAccoountCreated;
}

public void getDetails(){
	System.out.println("MAIN STARTED");
	System.out.println("------------------------");
	 for(UserAccount Account: userAccount){
		if(Account!=null){
		System.out.println("UserID:" +Account.getId());
		System.out.println("UserName:" +Account.getUserName());
		System.out.println("Email:" +Account.getEmail());
		System.out.println("Password:" +Account.getPassword());
		System.out.println("Gender:" +Account.getGender());
		System.out.println("---------------------");
	 }
	 }
}
}
	     