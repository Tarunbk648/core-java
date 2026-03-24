class Netflix{
  
  String[] webSeries = new String[3];
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
  System.out.println("List of webseries");
     for(String webseries: webSeries){
	    System.out.println(webseries);
     }
	}
 }