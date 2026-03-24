class Wonderla{
 String[] waterGames= new String[3];
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
		 isGamesAdded=false;
		}
	return isGamesAdded;
	}
	
	public void getWaterGames(){
	   System.out.println("First game is:" +waterGames[1]);
	  }
	 }