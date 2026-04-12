class Map{
  String mapName;
  boolean isNavigationOn;
  Location location;
  
  Map(String mapN, boolean navigationOn, Location location){
     this.mapName=mapN;
	 this.isNavigationOn=navigationOn;
	 this.location=location;
	 System.out.println("Map constructor is called");
	  }

  // public boolean setMapData(String mn, Location location){
       // boolean isMapDataAdded=false;
       // this.mapName=mn;
	   // System.out.println("Set data map name:" +this.mapName);
	   // this.location=location;
	   // isMapDataAdded=true;
	   // return isMapDataAdded;
	   // }
	
  public void getDetails(){
	System.out.println();
	System.out.println("Get Details method called");
    System.out.println("Map Name(instance variable):" +this.mapName);
	System.out.println("Is Navigation on(instance variable):" +this.isNavigationOn);
	System.out.println("Map location(instance variable):" +this.location);
	System.out.println("Assigning a values to the location");
	System.out.println("Map name(custom type):" +this.location.placename);
	System.out.println("Map latitude(custom type):" +this.location.latitude);
	System.out.println("Map latitude (custom type):" +this.location.longitude);
	System.out.println("Map city (custom type):" +this.location.city);
	}
}
	   