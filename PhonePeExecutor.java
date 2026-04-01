class PhonePeExecutor{
 public static void main(String[] args){
   PhonePe phonepe = new PhonePe();
   // phonepe.addInsurance("Health Insurance");
   // phonepe.addInsurance("Bike Insurance");
   // phonepe.addInsurance("Car Insurance");

   
   // phonepe.getInsurance();
   
   // phonepe.getNameByIndex(0);
   
   // phonepe.getIndexByName("Bike Insurance");

   // phonepe.UpdateName("Health Insurance", "Plane Insurance");

   // phonepe.deleteName("Bike Insurance");

   phonepe.getInsurance();

  String[] insurance={"Health Insurance", "Bike Insurance", "Car Insurance"};
  boolean insuranceNames=phonepe.createInsuranceNames(insurance);
  System.out.println("Insurance names:" +insuranceNames);
   }
  }
