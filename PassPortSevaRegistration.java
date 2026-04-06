class PassPortSevaRegistration{
   private int passportId;
   private String applicantName;
   private String dateOfBirth;
   private boolean ResidentOfIndia;
   private String gender;
   private String address;
   
   public void setId(int Id){
	   this.passportId=Id;
   }
   public int getID(){
	   return this.passportId;
   }
   public void setName(String name){
	   this.applicantName=name;
   }
   public String getName(){
	   return this.applicantName;
   }
   public void setDob(String Dob){
	   this.dateOfBirth=Dob;
   }
   public String getDob(){
	   return this.dateOfBirth;
   }
   public void setResident(boolean resident){
	   this.ResidentOfIndia=resident;
   }
   public boolean getResident(){
	   return this.ResidentOfIndia;
   }
   public void setGender(String gender){
	   this.gender=gender;
   }
   public String getGender(){
	   return this.gender;
   }
   public void setAddress(String address){
	   this.address=address;
   }
   public String getAddress(){
	   return this.address;
   }
}