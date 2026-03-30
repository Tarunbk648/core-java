class WonderlaExecutor{
 public static void main(String[] args){
    Wonderla wonderla = new Wonderla();
	wonderla.addWaterGames("Wave pool");
	wonderla.addWaterGames("Lazy River");
	wonderla.addWaterGames("Rain Disco");
	
	wonderla.getWaterGames();
	
	wonderla.getNameByIndex(0);
	
	wonderla.getIndexByName("Rain Disco");

	wonderla.updateAppName("Rain Disco", "Disco Rain");

	wonderla.deleteGames("Lazy River");

	wonderla.getWaterGames();
	}
 }