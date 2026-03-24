class PhonePe{
   String insuranceNames[] = new String[3];
   int index;
   
   public boolean addInsurance(String name){
      boolean isInsuranceAdded=false;
	  if(name!=null && !name.isEmpty()){
	     insuranceNames[index]=name;
		 index++;
		 isInsuranceAdded=true;
		}
	  else{
	    System.out.println("Insurance list is full");
		isInsuranceAdded=false;
		}
		return isInsuranceAdded;
	 }
	 
	 public void getInsurance(){
	 System.out.println("LISTS OF INSURANCE NAMES");
	  for(String insurancenames: insuranceNames){
	     System.out.println(insurancenames);
	   }
	   }
}