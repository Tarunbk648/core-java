class OrderDetails {
 private int orderId;
 private String productName;
 private int quantity;
 private double price;
 private String orderDate;
 private String status;
 private String customerName;

 public void setOrderId(int orderId){
   this.orderId = orderId;
 }
 public int getOrderId(){
   return this.orderId;
 }

 public void setProductName(String productName){
   this.productName = productName;
 }
 public String getProductName(){
   return this.productName;
 }

 public void setQuantity(int quantity){
   this.quantity = quantity;
 }
 public int getQuantity(){
   return this.quantity;
 }

 public void setPrice(double price){
   this.price = price;
 }
 public double getPrice(){
   return this.price;
 }

 public void setOrderDate(String orderDate){
   this.orderDate = orderDate;
 }
 public String getOrderDate(){
   return this.orderDate;
 }

 public void setStatus(String status){
   this.status = status;
 }
 public String getStatus(){
   return this.status;
 }

 public void setCustomerName(String customerName){
   this.customerName = customerName;
 }
 public String getCustomerName(){
   return this.customerName;
 }
}