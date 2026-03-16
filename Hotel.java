class Hotel{
  int HotelId;
  String HotelName;
  String[] Branches;	
  Book book;
  
  Hotel(int HotelId, String HotelName,String[] Branches, Book book){
     this.HotelId=HotelId;
	 this.HotelName=HotelName;
	 this.Branches=Branches;
	 this.book=book;
	}
	
  public void getHotelDetails(){
	 System.out.println();
     System.out.println("The hotel id is:" +this.HotelId);
	 System.out.println("The hotel name is:" +this.HotelName);
	 System.out.println("Lists of hotel branches are");
	 for(String branches: Branches){
		  System.out.println(branches);
	 }
	 this.book.getBookDetails();
	 }
	}