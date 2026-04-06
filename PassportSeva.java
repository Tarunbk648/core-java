class PassportSeva{
  PassPortSevaRegistration  passportsevaregistration;
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
		this.passportsevaregistration=passportsevaregistration;
		isAccountCreated=true;
  }
  return isAccountCreated;
  }
	
	public void getDetails(){
		System.out.println("PassportId:" +passportsevaregistration.getID());
		System.out.println("Aplicant name:" +passportsevaregistration.getName());
		System.out.println("Applicant DOB:" +passportsevaregistration.getDob());
		System.out.println("Is indian:" +passportsevaregistration.getResident());
		System.out.println("Applicant gender:" +passportsevaregistration.getGender());
		System.out.println("Applicant address:" +passportsevaregistration.getAddress());
	}
  }
	    
	    
	    
	    