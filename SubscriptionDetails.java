class SubscriptionDetails {
 private int subscriptionId;
 private String planName;
 private double price;
 private int duration;
 private String startDate;
 private String endDate;
 private String status;

 public void setSubscriptionId(int subscriptionId){
   this.subscriptionId = subscriptionId;
 }
 public int getSubscriptionId(){
   return this.subscriptionId;
 }

 public void setPlanName(String planName){
   this.planName = planName;
 }
 public String getPlanName(){
   return this.planName;
 }

 public void setPrice(double price){
   this.price = price;
 }
 public double getPrice(){
   return this.price;
 }

 public void setDuration(int duration){
   this.duration = duration;
 }
 public int getDuration(){
   return this.duration;
 }

 public void setStartDate(String startDate){
   this.startDate = startDate;
 }
 public String getStartDate(){
   return this.startDate;
 }

 public void setEndDate(String endDate){
   this.endDate = endDate;
 }
 public String getEndDate(){
   return this.endDate;
 }

 public void setStatus(String status){
   this.status = status;
 }
 public String getStatus(){
   return this.status;
 }
}