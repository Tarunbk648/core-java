class UserAccount{
 private int id;
 private String userName;
 private String email;
 private String password;
 private long phone;
 private String address;
 private boolean isActive;
 
 public void setId(int id){
   this.id=id;
  }
 public int getId(){
  return this.id;
  }
 public void setUserName(String userName){
   this.userName=userName;
   }
  public String getUserName(){
     return this.userName;
	 }
 public void setEmail(String email){
    this.email=email;
 }
 public String getEmail(){
     return this.email;
	 }
 public void setPassword(String password){
    this.password=password;
	}
 public String getPassword(){
     return this.password;
	 }
 public void setPhone(long phone){
     this.phone=phone;
	}
 public long getPhone(){
    return this.phone;
	}
 public void setAddress(String address){
    this.address=address;
	}
 public String getAddress(){
   return this.address;
   }
   public void setActive(boolean isActive){
      this.isActive=isActive;
	  }
   public boolean getActive(){
       return this.isActive;
	   }
	 }
      