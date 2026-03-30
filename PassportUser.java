class PassportUser {
 private int passportId;
 private String name;
 private String country;
 private String expiryDate;
 private String gender;
 private String address;
 private int age;

 public void setPassportId(int passportId){
   this.passportId = passportId;
 }
 public int getPassportId(){
   return this.passportId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setCountry(String country){
   this.country = country;
 }
 public String getCountry(){
   return this.country;
 }

 public void setExpiryDate(String expiryDate){
   this.expiryDate = expiryDate;
 }
 public String getExpiryDate(){
   return this.expiryDate;
 }

 public void setGender(String gender){
   this.gender = gender;
 }
 public String getGender(){
   return this.gender;
 }

 public void setAddress(String address){
   this.address = address;
 }
 public String getAddress(){
   return this.address;
 }

 public void setAge(int age){
   this.age = age;
 }
 public int getAge(){
   return this.age;
 }
}