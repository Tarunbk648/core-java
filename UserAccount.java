public class UserAccount{
  private int Id;
  private String userName;
  private String email;
  private String password;
  private String phoneNumber;
  private String gender;
  
  public void setId(int Id){
    this.Id=Id;
	}
  public int getId(){
   return this.Id;
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
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber=phoneNumber;
	}
  public String getPhoneNumber(){
     return this.phoneNumber;
	 }
  public void setGender(String gender){
     this.gender=gender;
	 }
  public String getGender(){
    return this.gender;
	}
 }
  