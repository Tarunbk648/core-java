class IPL{
   int season;
   RCB rcb;
   
   IPL(){
   System.out.println("Default constructor called");
   }
   
   public boolean setData(int season, RCB rcb){
     boolean isDataAdded=false;
     this.season=season;
	 this.rcb=rcb;
	 System.out.println("Set data season:" +this.season);
	 isDataAdded=true;
	 return isDataAdded;
	 }
	 
	 public void getdetails(){
	   System.out.println("Get details method called");
	   System.out.println("Instance variable(season)--->:" +this.season);
	   System.out.println("Instance variable(custom type data)--->:" +this.rcb);
	   System.out.println("RCB slogan:" +this.rcb.slogan);
	   System.out.println("RCB starPlayer:" +this.rcb.starPlayer);
	   System.out.println("RCB fanBaseInMillion:" +this.rcb.fanBaseInMillion);
	   System.out.println("RCB highestScore:" +this.rcb.highestScore);
	   System.out.println("RCB playoffQualified:" +this.rcb.playoffQualified);
	   }
	 }
	 
   