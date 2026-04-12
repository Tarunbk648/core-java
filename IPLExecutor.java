class IPLExecutor{
 public static void main(String[] args){
	IPL ipl = new IPL();
	ipl.season= 2026;
	RCB rcb = new RCB();
	rcb.slogan="Ee Sala Cup Namdhe";
	rcb.starPlayer="Virat Kohli";
	rcb.fanBaseInMillion=30;
	rcb.highestScore=263.0;
	rcb.playoffQualified=true;
	
	ipl.rcb=rcb;  //Assigning custom ref into object ref
	
	// boolean ref=ipl.setData(2027, rcb);
	// System.out.println("Is data added to the method:" +ref);
	
	ipl.getdetails();
	}
 }
	