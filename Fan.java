class Fan{
  int fanId;
  Capacitor capacitor;
  
  // Fan(int fanId, Capacitor capacitor){
   // this.fanId=fanId;
   // this.capacitor=capacitor;
   // System.out.println("Constructor called");
   // }
   Fan(){
	   System.out.println("Fan Default constructor called");
   }
   
   public boolean setData(int fanId, Capacitor capacitor){
	 boolean isDataAdded=false;
     this.fanId=fanId;
	 this.capacitor=capacitor;
	 System.out.println("Method called");
	 isDataAdded=true;
	 return isDataAdded;
	 }
  
  public void getDetails(){
	  System.out.println();
	  System.out.println("Get details method called");
	  System.out.println("Fan Id:" +this.fanId);
	  System.out.println("Capacitor:" +this.capacitor);
	  System.out.println("ASSIGING A LOCATION TO THE ABOVE CAPACITOR ADDRESS");
	  System.out.println("Capacitance:" +this.capacitor.capacitance);
	  System.out.println("Volatage Rating:" +this.capacitor.voltageRating);
	  System.out.println("Fan Type:" +this.capacitor.type);
	  System.out.println("Fan brand:" +this.capacitor.brand);
	  System.out.println("Fan tolerance:" +this.capacitor.tolerance);
	  System.out.println("Fan working status:" +this.capacitor.isWorking);
   }
  }