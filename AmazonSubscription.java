class AmazonSubscription{
  private int accountId;
  private String customerName;
  private String email;
  private long phoneNumber;
  private String address;
  
  public void setId(int Id){
    this.accountId=Id;
	}
  public int getId(){
	  return this.accountId;
  }
  public void setName(String name){
	  this.customerName=name;
  }
  public String getName(){
	  return this.customerName;
  }
  public void setEmail(String email){
	  this.email=email;
  }
  public String getEmail(){
	  return this.email;
  }
  public void setPhoneNumber(long number){
	  this.phoneNumber=number;
  }
  public long getPhoneNumber(){
	  return this.phoneNumber;
  }
  public void setAddress(String address){
	  this.address=address;
  }
  public String getAddress(){
	  return this.address;
  }
}