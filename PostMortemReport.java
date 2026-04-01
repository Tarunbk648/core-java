class PostMortemReport {
 private int reportId;
 private String patientName;
 private String causeOfDeath;
 private String doctorName;
 private String hospital;
 private String date;
 private boolean isCompleted;

 public void setReportId(int reportId){
   this.reportId = reportId;
 }
 public int getReportId(){
   return this.reportId;
 }

 public void setPatientName(String patientName){
   this.patientName = patientName;
 }
 public String getPatientName(){
   return this.patientName;
 }

 public void setCauseOfDeath(String causeOfDeath){
   this.causeOfDeath = causeOfDeath;
 }
 public String getCauseOfDeath(){
   return this.causeOfDeath;
 }

 public void setDoctorName(String doctorName){
   this.doctorName = doctorName;
 }
 public String getDoctorName(){
   return this.doctorName;
 }

 public void setHospital(String hospital){
   this.hospital = hospital;
 }
 public String getHospital(){
   return this.hospital;
 }

 public void setDate(String date){
   this.date = date;
 }
 public String getDate(){
   return this.date;
 }

 public void setIsCompleted(boolean isCompleted){
   this.isCompleted = isCompleted;
 }
 public boolean getIsCompleted(){
   return this.isCompleted;
 }
}