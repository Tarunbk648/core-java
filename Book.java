class Book{
  int BookId;
  
  Book(int BookId){
     this.BookId=BookId;
	 }
	 
	public void getBookDetails(){
	   System.out.println("The book id is:" +this.BookId);
	   }
	}