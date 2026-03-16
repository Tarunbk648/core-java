class Duration{
  int dailyDuration;
  
  Duration(int dailyDuration){
    this.dailyDuration=dailyDuration;
	}
	
  public void getDurationDetails(){
	System.out.println("------ FETCHING A DURATION DETAILS ------>");
    System.out.println("Daily duration in hours:" +this.dailyDuration);
	}
}