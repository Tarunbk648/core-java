class Medicine {
 private int medicineId;
 private String name;
 private String type;
 private double price;
 private String manufacturer;
 private String expiryDate;
 private String usage;

 public void setMedicineId(int medicineId){
   this.medicineId = medicineId;
 }
 public int getMedicineId(){
   return this.medicineId;
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

 public void setManufacturer(String manufacturer){
   this.manufacturer = manufacturer;
 }
 public String getManufacturer(){
   return this.manufacturer;
 }

 public void setExpiryDate(String expiryDate){
   this.expiryDate = expiryDate;
 }
 public String getExpiryDate(){
   return this.expiryDate;
 }

 public void setUsage(String usage){
   this.usage = usage;
 }
 public String getUsage(){
   return this.usage;
 }
}