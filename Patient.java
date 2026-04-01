class Patient {

 private int patientId;
 private String name;
 private int age;
 private String gender;
 private String disease;
 private String doctorName;
 private String hospitalName;

 public void setPatientId(int patientId){
   this.patientId = patientId;
 }
 public int getPatientId(){
   return this.patientId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setAge(int age){
   this.age = age;
 }
 public int getAge(){
   return this.age;
 }

 public void setGender(String gender){
   this.gender = gender;
 }
 public String getGender(){
   return this.gender;
 }

 public void setDisease(String disease){
   this.disease = disease;
 }
 public String getDisease(){
   return this.disease;
 }

 public void setDoctorName(String doctorName){
   this.doctorName = doctorName;
 }
 public String getDoctorName(){
   return this.doctorName;
 }

 public void setHospitalName(String hospitalName){
   this.hospitalName = hospitalName;
 }
 public String getHospitalName(){
   return this.hospitalName;
 }
}