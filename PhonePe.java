class PhonePe{
   String insuranceNames[] = new String[31];
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
		  if(insurancenames!=null){
	     System.out.println(insurancenames);
	   }
	   }
	 }
	   
	  public String getNameByIndex(int index){
		  String name=null;
		  if(index<insuranceNames.length){
			  name=insuranceNames[index];
			  System.out.println("The name is at index," +index+ ",is" +name);
			}
			else System.out.println("Invalid index data");
			return name;
	  }
	  
	  public int getIndexByName(String name){
		    int index=0;
			for(String names:insuranceNames){
				 if(names!=null && names==name){
					 System.out.println("The," +names+ "at index" +index);
				 }
				 index++;
			}
			return index;
	  }
}
    