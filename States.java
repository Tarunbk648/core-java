class States{
 String statesName[]= new String[5];
 int index=0;
 
 public boolean addStatesNames(String state){
   boolean isStateAdded=false;
   if(state!=null && !state.isEmpty()){
       statesName[index]=state;
	   index++;
	  isStateAdded=true;
	   }
	else System.out.println("Not added");
	return isStateAdded;
 }
 
 public void getStateNames(){
   for(String states: statesName){
       if(states!=null){
	      System.out.println(states);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<statesName.length){
	  name=statesName[index];
	  System.out.println("The name at index" +index+ " is " +name);
	  }
	else System.out.println("Invalid index value");
    return name;
   }

 public int getIndexByName(String names){
   int index=0;
   for(String name:statesName){
      if(name!=null && name==names){
          System.out.println("The " +name+ " is at index " +index);
		  return index;
      }
      index++;
    }
    System.out.println("Invalid name");
     return -1;
  }
  
  // public void printAllNames(){
	//  for(int i=0; i<statesName.length; i++){
	// 	 if(statesName[i]!=null){
	// 		 System.out.println("The name  " +statesName[i]+ " at index " +i);
	// 	 }
  // }  

  public boolean updateAppName(String existingName, String updatedName){
    boolean isAppUpdated=false;
    for(int i=0; i<statesName.length; i++){
      if(statesName[i]==existingName){
        statesName[i]=updatedName;
        System.out.println(existingName + "is updated to" +updatedName);
        isAppUpdated=true;
      }
    }
    if(isAppUpdated==false){
      System.out.println(existingName + "not in list");
    }
    return isAppUpdated;
  }
  public boolean deleteStatesName(String name){
    boolean isStateDeleted=false;
    for(int i=0; i<statesName.length; i++){
      if(statesName[i]!=null && statesName[i]==name){
        statesName[i]=null;
        System.out.println(name +" is deleted");
        isStateDeleted=true;
      }
    }
    if(isStateDeleted==false){
      System.out.println(name +"not in list");
    }
    return isStateDeleted;
  }
  
 }
