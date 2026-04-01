class Fertilizer {
 private int fertilizerId;
 private String name;
 private String type;
 private double price;
 private String brand;
 private double quantity;
 private String usage;

 public void setFertilizerId(int fertilizerId){
   this.fertilizerId = fertilizerId;
 }
 public int getFertilizerId(){
   return this.fertilizerId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setType(String type){
   this.type = type;
 }
 public String getType(){
   return this.type;
 }

 public void setPrice(double price){
   this.price = price;
 }
 public double getPrice(){
   return this.price;
 }

 public void setBrand(String brand){
   this.brand = brand;
 }
 public String getBrand(){
   return this.brand;
 }

 public void setQuantity(double quantity){
   this.quantity = quantity;
 }
 public double getQuantity(){
   return this.quantity;
 }

 public void setUsage(String usage){
   this.usage = usage;
 }
 public String getUsage(){
   return this.usage;
 }
}