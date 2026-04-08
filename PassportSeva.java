class PassportSeva{
  PassPortSevaRegistration  passportsevaregistration[]= new PassPortSevaRegistration[20];
  int index;
  public boolean createPassportSevaAccount(PassPortSevaRegistration  passportsevaregistration){
     boolean isAccountCreated=false;
	 boolean isPassportIdValid=false;
	 boolean isApplicantNameValid=false;
	 boolean isDateOfBirthValid=false;
	 boolean isApplicantBelongsToIndia=false;
	 boolean isGenderValid=false;
	 boolean isAddressValid=false;
	 
	 int passportId=passportsevaregistration.getID();
	 if(passportId>0){
	     isPassportIdValid=true;
		 }
	  
	 String applicantName= passportsevaregistration.getName();
	 if(applicantName!=null && !applicantName.isEmpty()){
	    isApplicantNameValid=true;
		}
		
	 String dateOfBirth=passportsevaregistration.getDob();
	 if(dateOfBirth!=null && !dateOfBirth.isEmpty()){
	    isDateOfBirthValid=true;
		}
		
	 boolean ResidentOfIndia=passportsevaregistration.getResident();
	 if(ResidentOfIndia==true){
	    isApplicantBelongsToIndia=true;
		}
		
	 String gender=passportsevaregistration.getGender();
	 if(gender!=null && !gender.isEmpty()){
	    isGenderValid=true;
		}
		
	 String address=passportsevaregistration.getAddress();
	 if(address!=null && !address.isEmpty()){
	    isAddressValid=true;
		}
	if(isPassportIdValid==true && isApplicantNameValid==true && isDateOfBirthValid==true && isApplicantBelongsToIndia==true &&  isGenderValid==true &&  isAddressValid==true){
		this.passportsevaregistration[index]=passportsevaregistration;
		index++;
		isAccountCreated=true;
  }
  return isAccountCreated;
  }
	
	public void getDetails(){
		System.out.println("MAIN STARTED");
		System.out.println("------------------");
		for(PassPortSevaRegistration  passportseva:passportsevaregistration){
		if(passportseva!=null){
		System.out.println("PassportId:" +passportseva.getID());
		System.out.println("Aplicant name:" +passportseva.getName());
		System.out.println("Applicant DOB:" +passportseva.getDob());
		System.out.println("Is indian:" +passportseva.getResident());
		System.out.println("Applicant gender:" +passportseva.getGender());
		System.out.println("Applicant address:" +passportseva.getAddress());
		System.out.println("----------------------------");
	}
	}
  }
}
	    
	    
	    
	    