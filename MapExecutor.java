class MapExecutor{
 public static void main(String[] args){
	//Map map = new Map("Google Map", true, location);
	Location location = new Location();
	location.placename="Rajajinagar";
    location.latitude=12.3052;
    location.longitude=76.6552;
    location.city="Banglore";
	Map map = new Map("Google Map", true, location);
	
	// boolean ref=map.setMapData("Default app", location);
	// System.out.println("Is data added to the method:" +ref);
	
	map.getDetails();
	}
}
	
	