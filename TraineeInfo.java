class TraineeInfo {

 private int traineeId;
 private String name;
 private String course;
 private String trainer;
 private int duration;
 private String batch;
 private boolean isActive;

 public void setTraineeId(int traineeId){
   this.traineeId = traineeId;
 }
 public int getTraineeId(){
   return this.traineeId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setCourse(String course){
   this.course = course;
 }
 public String getCourse(){
   return this.course;
 }

 public void setTrainer(String trainer){
   this.trainer = trainer;
 }
 public String getTrainer(){
   return this.trainer;
 }

 public void setDuration(int duration){
   this.duration = duration;
 }
 public int getDuration(){
   return this.duration;
 }

 public void setBatch(String batch){
   this.batch = batch;
 }
 public String getBatch(){
   return this.batch;
 }

 public void setIsActive(boolean isActive){
   this.isActive = isActive;
 }
 public boolean getIsActive(){
   return this.isActive;
 }
}