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
}