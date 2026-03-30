class Wonderla{
 String[] waterGames= new String[21];
 int index;
 
 public boolean addWaterGames(String games){
   boolean isGamesAdded=false;
   if(games!=null && !games.isEmpty()){
       waterGames[index]=games;
	   index++;
	   isGamesAdded=true;
	  }
	else{
	     System.out.println("Invalid games lists");
		 
		}
	return isGamesAdded;
	}
	
	public void getWaterGames(){
	  System.out.println("Lists of water games");
	  for(String watergames:waterGames){
		  if(watergames!=null){
		  System.out.println(watergames);
		  
	  }
	  }
	  }
	public String getNameByIndex(int index){
		String name=null;
		if(index<waterGames.length){
			name=waterGames[index];
			System.out.println("The name at index" +index+ " is " +name);
		}
		else System.out.println("Invalid index");
		return name;
	}
	public int getIndexByName(String name){
		int index=0;
		for(String names:waterGames){
			if(names!=null && names==name){
				System.out.println("The " +name+ " is at index" +index);
			}
			index++;
		}
		return index;
	}

	public boolean updateAppName(String existingName, String updatedName){
		boolean isAppUpdated=false;
		for(int i=0; i<waterGames.length; i++){
			if(waterGames[i]==existingName){
				waterGames[i]=updatedName;
				System.out.println(existingName + "is updated to" +updatedName);
				isAppUpdated=true;
			}
		}
		if(isAppUpdated==false){
			System.out.println(existingName + "not in list");
		}
		return isAppUpdated;
	}

	public boolean deleteGames(String name){
		boolean isGameDeleted=false;
		for(int i=0; i<waterGames.length; i++){
			if(waterGames[i]!=null && waterGames[i]==name){
				waterGames[i]=null;
				System.out.println(name +"is deleted");
				isGameDeleted=true;
			}
		}
		if(isGameDeleted==false){
			System.out.println(name + "not in list");
		}
		return isGameDeleted;
	}
}