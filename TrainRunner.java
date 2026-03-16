class TrainRunner{
  public static void main(String[] args){
     Boggy boggy = new Boggy(301, "Passanger", 72);
	 Train train = new Train(101, "Shatabdi Express", "Banglore", "Chennai", boggy);
	 train.getDetail();
	 
	 Boggy boggy1= new Boggy(278, "Goods", 0);
	 Train train1 = new Train(102, "Goods carrier", "Mumbai", "Coimbator", boggy1);
	 train1.getDetail();
	 }
  }