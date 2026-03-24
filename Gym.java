class Gym{
  String[] equipment = new String[4];
  int index;
  
  public void addEquipment(String name){
   if(name!=null && !name.isEmpty()){
      equipment[index]=name;
	  index++;
	  }
	 else{
	    System.out.println("Equipment list is full");
		}
	}
 
 public void getEquipmentDetails(){
  System.out.println("LISTS OF EQUIPMENT");
  for(String equipments: equipment){
    System.out.println(equipments);
 }
}
 
  Gym(){
     System.out.println("Gym class Started");
	}
}