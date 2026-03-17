class TediBar{
 String name;
 double price;
 String brand;
 int quantity;
 double weight;
 
 TediBar(){
   System.out.println("Default constructor is called");
   }
   
   TediBar(String name, double price, String brand, int quantity, double weight){
     this();
	 System.out.println("Linking using this() keyword");
	 this.name=name;
	 this.price=price;
	 this.brand=brand;
	 this.quantity=quantity;
	 this.weight=weight;
	 }
  
  public void display(){
    System.out.println("Name :" +this.name);
	System.out.println("Price:" +this.price);
	System.out.println("Brand:" +this.brand);
	System.out.println("Quantity:" +this.quantity);
	System.out.println("Weight:" +this.weight);
	}
}