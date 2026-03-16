class Boggy{
  int boggyNumber;
  String boggyType;
  int seatingCapacity;
  
  Boggy(int boggyNumber, String boggyType, int seatingCapacity){
     this.boggyNumber=boggyNumber;
	 this.boggyType=boggyType;
	 this.seatingCapacity=seatingCapacity;
	 }
	 
  public void getBoggyDetails(){
    System.out.println("The boggy number is:" +this.boggyNumber);
	System.out.println("The boggy type is:" +this.boggyType);
	System.out.println("The seating capacity is:" +this.seatingCapacity);
	}
 }