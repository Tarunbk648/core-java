class StateExecutor{
   public static void main(String[] states){
      States state = new States();
	  // state.addStatesNames("Karnataka");
	  // state.addStatesNames("TamilNadu");
	  // state.addStatesNames("Kerala");
	  // state.addStatesNames("Andhra pradesh");
	  // state.addStatesNames("Madhya pradesh");
	  
	  // state.getStateNames();
	  
	  // state.getNameByIndex(0);
	  
	  // state.getIndexByName("Karnataka");

	  // state.updateAppName("Kerala", "Rajajinagar");

	  // state.deleteStatesName("TamilNadu");
	  
	   state.getStateNames();

	   String[] names={"Karnataka", "Tamil Nadu", "Kerala", "Andhra pradesh", "Madhya pradesh"};
	   boolean stateNames=state.createeStateNames(names);
	   System.out.println("The state names:" +stateNames);
	 }
 }
