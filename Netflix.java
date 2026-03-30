class Netflix{
  
  String[] webSeries = new String[19];
  int index;
  
  public void addWebSeries(String series){
     if(series!=null && ! series.isEmpty()){
	    webSeries[index]=series;
		index++;
		}
	else{
	  System.out.println("List is full");
	  }
	 }
	 
 public void getWebSeries(){
  System.out.println("LIST OF WEBSERIES");
     for(String webseries: webSeries){
		 if(webseries!=null){
	    System.out.println(webseries);
     }
	 }
	}
	
 public String getWebSeriesNames(int index){
	  String name=null;
	  if(index<webSeries.length){
		  name=webSeries[index];
		  System.out.println("The name at index" +index+ ",is," +name);	  
		}
	  else System.out.println("Invalid index found" +index);
	 return name;
 }
 
 public int getWebSeriesIndex(String name){
     int index=0;
	 for(String names:webSeries){
		 if(names!=null && names==name){
			 System.out.println("The, " +names+ ",at index" +index);
		 }
		 index++;
	 }
	 return index;
}

 public boolean UpdatedName(String existingName, String updatedName){
	boolean isAppUpdated=false;
	for(int i=0; i<webSeries.length; i++){
		if(webSeries[i]==existingName){
			webSeries[i]=updatedName;
			System.out.println(existingName + "is updated to" +updatedName);
			isAppUpdated=true;
		}

	}
	if(isAppUpdated==false){
		System.out.println(existingName +"Not in list");
	}
	return isAppUpdated;
 }

 public boolean deleteName(String name){
	boolean isNamedeleted=false;
	for(int i=0; i<webSeries.length; i++){
		if(webSeries[i]!=null && webSeries[i]==name){
			webSeries[i]=null;
			System.out.println(name +" is deleted");
			isNamedeleted=true;
		}
	}
	if(isNamedeleted==false){
		System.out.println(name + "not in list");
	}
	
 return isNamedeleted;
}
 
}