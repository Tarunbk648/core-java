class TrainingCenter{
	TrainingCenterDescription trainingcenter;
	
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
					this.trainingcenter=trainingcenter;
					isDataAdded=true;
		  }
		  return isDataAdded;
	}
		  
		  public void getDetails(){
			  System.out.println("ID:" +trainingcenter.getId());
			  System.out.println("Center Name:" +trainingcenter.getCenterName());
			  System.out.println("Trainer Name:" +trainingcenter.getTrainerName());
			  System.out.println("Course Name:" +trainingcenter.getCourseName());
			  System.out.println("Course Duration:" +trainingcenter.getDuration());
		  }


}