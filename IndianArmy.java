class IndianArmy {
 private int soldierId;
 private String name;
 private String rank;
 private String regiment;
 private int age;
 private String location;
 private boolean onDuty;

 public void setSoldierId(int soldierId){
   this.soldierId = soldierId;
 }
 public int getSoldierId(){
   return this.soldierId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setRank(String rank){
   this.rank = rank;
 }
 public String getRank(){
   return this.rank;
 }

 public void setRegiment(String regiment){
   this.regiment = regiment;
 }
 public String getRegiment(){
   return this.regiment;
 }

 public void setAge(int age){
   this.age = age;
 }
 public int getAge(){
   return this.age;
 }

 public void setLocation(String location){
   this.location = location;
 }
 public String getLocation(){
   return this.location;
 }

 public void setOnDuty(boolean onDuty){
   this.onDuty = onDuty;
 }
 public boolean getOnDuty(){
   return this.onDuty;
 }
}