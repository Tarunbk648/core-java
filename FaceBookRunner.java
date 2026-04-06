public class FaceBookRunner{
  public static void main(String[] args){
    Facebook fb = new Facebook();
	UserAccount ua= new UserAccount();
	ua.setId(1);
	ua.setUserName("Harish");
	ua.setEmail("Harish@gmail.com");
	ua.setPassword("Harish123");
	ua.setPhoneNumber("9786345226");
	ua.setGender("Male");
    
	boolean ref=fb.createUserAccount(ua);
	System.out.println(ref);
	
	fb.getDetails();
	
	
	System.out.println();
	UserAccount ua2= new UserAccount();
	ua2.setId(2);
	ua2.setUserName("Harish");
	ua2.setEmail("Harish@gmail.com");
	ua2.setPassword("Harish123");
	ua2.setPhoneNumber("9786345226");
	ua2.setGender("Male");
    
	boolean ref2=fb.createUserAccount(ua2);
	System.out.println(ref2);
	
	fb.getDetails();
	
	
	System.out.println();
	UserAccount ua3= new UserAccount();
	ua3.setId(3);
	ua3.setUserName("Harish");
	ua3.setEmail("Harish@gmail.com");
	ua3.setPassword("Harish123");
	ua3.setPhoneNumber("9786345226");
	ua3.setGender("Male");
    
	boolean ref3=fb.createUserAccount(ua3);
	System.out.println(ref3);
	
	fb.getDetails();
	
	
	System.out.println();
	UserAccount ua4= new UserAccount();
	ua4.setId(4);
	ua4.setUserName("Harish");
	ua4.setEmail("Harish@gmail.com");
	ua4.setPassword("Harish123");
	ua4.setPhoneNumber("9786345226");
	ua4.setGender("Male");
    
	boolean ref4=fb.createUserAccount(ua4);
	System.out.println(ref4);
	
	fb.getDetails();
	
	
	System.out.println();
	UserAccount ua5= new UserAccount();
	ua5.setId(5);
	ua5.setUserName("Harish");
	ua5.setEmail("Harish@gmail.com");
	ua5.setPassword("Harish123");
	ua5.setPhoneNumber("9786345226");
	ua5.setGender("Male");
    
	boolean ref5=fb.createUserAccount(ua5);
	System.out.println(ref5);
	
	fb.getDetails();
	}
 }
				