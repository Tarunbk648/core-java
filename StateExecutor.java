class StateExecutor{
   public static void main(String[] states){
      States state = new States();
	  state.addStatesNames("Karnataka");
	  state.addStatesNames("TamilNadu");
	  state.addStatesNames("Kerala");
	  state.addStatesNames("Andhra pradesh");
	  state.addStatesNames("Madhya pradesh");
	  
	  state.getStateNames();
	  
	  state.getNameByIndex(0);
	  
	  state.getIndexByName("Karnataka");

	  state.updateAppName("Kerala", "Rajajinagar");

	  state.deleteStatesName("TamilNadu");
	  
	   state.getStateNames();
	  
	 }
 }