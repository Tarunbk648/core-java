class Train{
  int TrainId;
  String TrainName;
  String TrainSource;
  String TrainDestination;
  Boggy boggy;
  
  Train(int TrainId, String TrainName, String TrainSource, String TrainDestination, Boggy boggy){
	this.TrainId=TrainId;
	this.TrainName=TrainName;
	this.TrainSource=TrainSource;
	this.TrainDestination=TrainDestination;
	this.boggy=boggy;
	}
	
  public void getDetail(){
	 System.out.println();
     System.out.println("The Train id is:" +this.TrainId);
	 System.out.println("The Train Name is:" +this.TrainName);
	 System.out.println("The Train Source is:" +this.TrainSource);
	 System.out.println("The Train Destination is:" +this.TrainDestination);
	 this.boggy.getBoggyDetails();
	 }
 }