class HotelRunner{
   public static void main(String[] args){
	 
       Book b = new Book(13);
	   String[] Branches={"VV puram", "Rajajinager"};
	   Hotel h = new Hotel(23, "RJ Hotel",Branches, b);
	   h.getHotelDetails();
	   
	   
	   Book b1 = new Book(45);
	   String[] Branches1={"BTM", "Vijayanagar"};
	   Hotel h1 = new Hotel(46, "TAJ Hotel",Branches1, b1);
	   h1.getHotelDetails();
	  }
	}