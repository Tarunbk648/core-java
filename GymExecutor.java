class GymExecutor{
  public static void main(String[] args){
      Gym gym = new Gym();
	  // gym.addEquipment("Treadmill");
	  // gym.addEquipment("Dumbbells");
	  // gym.addEquipment("Bench press");
	 
	  
	  // gym.getEquipmentDetails();
	  
	  // gym.getNameByIndex(1);
	  
	  // gym.getIndexByName("Bench press");

	  // gym.UpdateGymName("Treadmill" , "Runmill");

	  // gym.deleteitemName("Dumbbells");

	  // gym.getEquipmentDetails();

	  String[] equipmentNames={"Treadmill", "Dumbbells", "Bench press"};
	  boolean equipments= gym.createequipmentName(equipmentNames);
	  System.out.println("The equipment names are:" +equipments);
	  gym.getEquipmentDetails();
	  }
	}
