class TrainingCenter{
	TrainingCenterDescription trainingcenter[]= new TrainingCenterDescription[20];
	int index;
	
	public boolean addTrainingCenterData(TrainingCenterDescription trainingcenter){
		  boolean isDataAdded=false;
		  boolean isIdValid=false;
		  boolean isCenterNameValid=false;
		  boolean isTrainerNameValid=false;
		  boolean isCourseNameValid=false;
		  boolean isDurationValid=false;
		  
		  String id= trainingcenter.getId();
		  if(id!=null && !id.isEmpty()){
			  isIdValid=true;
		  }
		  
		  String centerName=trainingcenter.getCenterName();
		  if(centerName!=null && !centerName.isEmpty()){
			  isCenterNameValid=true;
		  }
		  
		  String trinerName=trainingcenter.getTrainerName();
		  if(trinerName!=null && !trinerName.isEmpty()){
			  isTrainerNameValid=true;
		  }
		  
		  String courseName=trainingcenter.getCourseName();
		  if(courseName!=null && !centerName.isEmpty()){
			  isCourseNameValid=true;
		  }
		  
		  String duration=trainingcenter.getDuration();
		  if(duration!=null && !duration.isEmpty()){
			  isDurationValid=true;
		  }
		  
		  if( isIdValid==true &&  isCenterNameValid==true  &&  isTrainerNameValid==true  &&  isCourseNameValid==true   &&  isDurationValid==true){
					this.trainingcenter[index++]=trainingcenter;
					isDataAdded=true;
		  }
		  return isDataAdded;
	}
		  
		  public void getDetails(){
			  System.out.println("MAIN STARTED");
			  System.out.println("---------------------------");
			  for(TrainingCenterDescription training:trainingcenter){
				  if(training!=null){
			  System.out.println("ID:" +training.getId());
			  System.out.println("Center Name:" +training.getCenterName());
			  System.out.println("Trainer Name:" +training.getTrainerName());
			  System.out.println("Course Name:" +training.getCourseName());
			  System.out.println("Course Duration:" +training.getDuration());
			  System.out.println("---------------------------");
		  }

	  }
	}
}