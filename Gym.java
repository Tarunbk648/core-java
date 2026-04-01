class Gym{
  String[] equipment = new String[20];
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
  System.out.println("LISTS OF EQUIPMENTS");
  for(String equipments: equipment){
	if(equipments!=null){
    System.out.println(equipments);
 }
  }
}
 
  Gym(){
     System.out.println("Gym class Started");
	}
	
	public String getNameByIndex(int index){
		String name=null;
		if(index<equipment.length){
			name=equipment[index];
			System.out.println("The name is at index " +index+ "is," +name);
		}
		else System.out.println("Invalid index");
		return name;
	}
	
	public int getIndexByName(String names){
		int index=0;
		for(String name:equipment){
			if(name!=null && name==names){
				System.out.println("The," +name+ ",is at index" +index);
				return index;
				
			}
			index++;
		}
	 
		System.out.println("Invalid index");
		return -1;
	}

	public boolean UpdateGymName(String existingName, String updatedName){
		boolean isAppUpdated=false;
		for(int i=0; i<equipment.length; i++){
			if(equipment[i]==existingName){
				equipment[i]=updatedName;
				System.out.println(existingName + "is updated to " +updatedName);
				isAppUpdated=false;

			}

		}

		if(isAppUpdated==false){
			System.out.println(existingName + "not in list");
		}
		return isAppUpdated;
	}

	public boolean deleteitemName(String item){
		boolean isItemDeleted=false;
		for(int i=0; i<equipment.length; i++){
			if(equipment[i]!=null && equipment[i]==item){
				equipment[i]=null;
				System.out.println(item +"is deleted");
				isItemDeleted=true;
			}
		}
		if(isItemDeleted==false){
			System.out.println(item +"not in the list");
		}
		return isItemDeleted;
	}

	public boolean createequipmentName(String[] equipment){
		boolean isEquipmentCreated=false;
		if(equipment.length<=this.equipment.length){
			this.equipment=equipment;
			isEquipmentCreated=true;
		}
		else System.out.println("Invalid");
		return isEquipmentCreated;
	}

}
		 
}
