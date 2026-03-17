class ZanduBalm{
 String name;
 double price;
 String brand;
 int quantity;
 double weight;
 
 ZanduBalm(){
   this("Zandu Balm", 50.0, "Zandu", 10, 25.5);
   System.out.println("Default constructor is invoked");
   }
   
 ZanduBalm(String name, double price, String brand, int quantity, double weight){
    this.name=name;
	this.price=price;
	this.brand=brand;
	this.quantity=quantity;
	this.weight=weight;
	}
	
 public void display(){
	 System.out.println("Name of vicks is:" +this.name);
	 System.out.println("Price of vicks is:" +this.price);
	 System.out.println("Brand of vicks is:" +this.brand);
	 System.out.println("Quantity of vicks is:" +this.quantity);
	 System.out.println("Weight of vicks is:" +this.weight);
}  

}