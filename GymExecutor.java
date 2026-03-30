class GymExecutor{
  public static void main(String[] args){
      Gym gym = new Gym();
	  gym.addEquipment("Treadmill");
	  gym.addEquipment("Dumbbells");
	  gym.addEquipment("Bench press");
	 
	  
	  gym.getEquipmentDetails();
	  
	  gym.getNameByIndex(1);
	  
	  gym.getIndexByName("Bench press");

	  gym.UpdateGymName("Treadmill" , "Runmill");

	  gym.deleteitemName("Dumbbells");

	  gym.getEquipmentDetails();
	  }
	}