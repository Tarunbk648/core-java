class TrainingCenterDescription{
  private String centerId;
  private String centerName;
  private String trainerName;
  private String courseName;
  private String duration;
  
  public void setId(String Id){
	this.centerId=Id;
	}
  public String getId(){
    return this.centerId;
	}
  public void setCenterName(String centerName){
    this.centerName=centerName;
	}
  public String getCenterName(){
	return this.centerName;
	}
  public void setTrainerName(String trainerName){
	this.trainerName=trainerName;
	}
  public String getTrainerName(){
	return this.trainerName;
	}
  public void setCourseName(String courseName){
	this.courseName=courseName;
	}
  public String getCourseName(){
	return this.courseName;
	}
  public void setDuration(String duration){
	this.duration=duration;
	}
  public String getDuration(){
	return this.duration;
	}
 }