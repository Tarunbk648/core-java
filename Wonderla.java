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
}