class Nasa {
 private int missionId;
 private String missionName;
 private String spacecraft;
 private String launchDate;
 private String destination;
 private int crewCount;
 private String status;

 public void setMissionId(int missionId){
   this.missionId = missionId;
 }
 public int getMissionId(){
   return this.missionId;
 }

 public void setMissionName(String missionName){
   this.missionName = missionName;
 }
 public String getMissionName(){
   return this.missionName;
 }

 public void setSpacecraft(String spacecraft){
   this.spacecraft = spacecraft;
 }
 public String getSpacecraft(){
   return this.spacecraft;
 }

 public void setLaunchDate(String launchDate){
   this.launchDate = launchDate;
 }
 public String getLaunchDate(){
   return this.launchDate;
 }

 public void setDestination(String destination){
   this.destination = destination;
 }
 public String getDestination(){
   return this.destination;
 }

 public void setCrewCount(int crewCount){
   this.crewCount = crewCount;
 }
 public int getCrewCount(){
   return this.crewCount;
 }

 public void setStatus(String status){
   this.status = status;
 }
 public String getStatus(){
   return this.status;
 }
}