class Wire{
 String name;
 double price;
 String brand;
 int quantity;
 double weight;
 
 Wire(){
   this("Copper wire", 500.0, "Finolex", 1, 1000.0);
   System.out.println("Default constructor is called");
   }
   
  Wire(String name, double price, String brand, int quantity, double weight){
    this.name=name;
	this.price=price;
	this.brand=brand;
	this.quantity=quantity;
	this.weight=weight;
	}
  
  public void display(){
    System.out.println("Name:" +this.name);
	System.out.println("Price:" +this.price);
	System.out.println("Brand:" +this.brand);
	System.out.println("Quantity:" +this.quantity);
	System.out.println("Weight:" +this.weight);
	}
}