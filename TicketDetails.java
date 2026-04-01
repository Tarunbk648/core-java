class TicketDetails {
 private int ticketId;
 private String passengerName;
 private String source;
 private String destination;
 private double price;
 private String date;
 private String status;

 public void setTicketId(int ticketId){
   this.ticketId = ticketId;
 }
 public int getTicketId(){
   return this.ticketId;
 }

 public void setPassengerName(String passengerName){
   this.passengerName = passengerName;
 }
 public String getPassengerName(){
   return this.passengerName;
 }

 public void setSource(String source){
   this.source = source;
 }
 public String getSource(){
   return this.source;
 }

 public void setDestination(String destination){
   this.destination = destination;
 }
 public String getDestination(){
   return this.destination;
 }

 public void setPrice(double price){
   this.price = price;
 }
 public double getPrice(){
   return this.price;
 }

 public void setDate(String date){
   this.date = date;
 }
 public String getDate(){
   return this.date;
 }

 public void setStatus(String status){
   this.status = status;
 }
 public String getStatus(){
   return this.status;
 }
}