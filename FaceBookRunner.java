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
	System.out.println("IS account created:" +ref);
	
	UserAccount ua2= new UserAccount();
	ua2.setId(2);
	ua2.setUserName("Mahesh");
	ua2.setEmail("Mahesh@gmail.com");
	ua2.setPassword("Mahesh123");
	ua2.setPhoneNumber("9786345226");
	ua2.setGender("Male");
	fb.createUserAccount(ua2);

	UserAccount ua3= new UserAccount();
	ua3.setId(3);
	ua3.setUserName("Sathish");
	ua3.setEmail("Sathish@gmail.com");
	ua3.setPassword("Satish123");
	ua3.setPhoneNumber("9786345226");
	ua3.setGender("Male");
	fb.createUserAccount(ua3);
	

	UserAccount ua4= new UserAccount();
	ua4.setId(4);
	ua4.setUserName("Ramesh");
	ua4.setEmail("Ramesh@gmail.com");
	ua4.setPassword("Ramesh123");
	ua4.setPhoneNumber("9786345226");
	ua4.setGender("Male");
	fb.createUserAccount(ua4);

	UserAccount ua5= new UserAccount();
	ua5.setId(5);
	ua5.setUserName("Harish");
	ua5.setEmail("Harish@gmail.com");
	ua5.setPassword("Harish123");
	ua5.setPhoneNumber("9786345226");
	ua5.setGender("Male");
	fb.createUserAccount(ua5);
	
	UserAccount ua6= new UserAccount();
	ua6.setId(6);
	ua6.setUserName("Rohit");
	ua6.setEmail("rohit06@gmail.com");
	ua6.setPassword("Rohit@123");
	ua6.setPhoneNumber("9876543201");
	ua6.setGender("Male");
	fb.createUserAccount(ua6);

	UserAccount ua7= new UserAccount();
	ua7.setId(7);
	ua7.setUserName("Priya");
	ua7.setEmail("priya07@gmail.com");
	ua7.setPassword("Priya@123");
	ua7.setPhoneNumber("9876543202");
	ua7.setGender("Female");
	fb.createUserAccount(ua7);

	UserAccount ua8= new UserAccount();
	ua8.setId(8);
	ua8.setUserName("Kiran");
	ua8.setEmail("kiran08@gmail.com");
	ua8.setPassword("Kiran@123");
	ua8.setPhoneNumber("9876543203");
	ua8.setGender("Male");
	fb.createUserAccount(ua8);

	UserAccount ua9= new UserAccount();
	ua9.setId(9);
	ua9.setUserName("Sneha");
	ua9.setEmail("sneha09@gmail.com");
	ua9.setPassword("Sneha@123");
	ua9.setPhoneNumber("9876543204");
	ua9.setGender("Female");
	fb.createUserAccount(ua9);

	UserAccount ua10= new UserAccount();
	ua10.setId(10);
	ua10.setUserName("Ajay");
	ua10.setEmail("ajay10@gmail.com");
	ua10.setPassword("Ajay@123");
	ua10.setPhoneNumber("9876543205");
	ua10.setGender("Male");
	fb.createUserAccount(ua10);

	UserAccount ua11= new UserAccount();
	ua11.setId(11);
	ua11.setUserName("Pooja");
	ua11.setEmail("pooja11@gmail.com");
	ua11.setPassword("Pooja@123");
	ua11.setPhoneNumber("9876543206");
	ua11.setGender("Female");
	fb.createUserAccount(ua11);

	UserAccount ua12= new UserAccount();
	ua12.setId(12);
	ua12.setUserName("Manoj");
	ua12.setEmail("manoj12@gmail.com");
	ua12.setPassword("Manoj@123");
	ua12.setPhoneNumber("9876543207");
	ua12.setGender("Male");
	fb.createUserAccount(ua12);

	UserAccount ua13= new UserAccount();
	ua13.setId(13);
	ua13.setUserName("Kavya");
	ua13.setEmail("kavya13@gmail.com");
	ua13.setPassword("Kavya@123");
	ua13.setPhoneNumber("9876543208");
	ua13.setGender("Female");
	fb.createUserAccount(ua13);

	UserAccount ua14= new UserAccount();
	ua14.setId(14);
	ua14.setUserName("Vikram");
	ua14.setEmail("vikram14@gmail.com");
	ua14.setPassword("Vikram@123");
	ua14.setPhoneNumber("9876543209");
	ua14.setGender("Male");
	fb.createUserAccount(ua14);

	UserAccount ua15= new UserAccount();
	ua15.setId(15);
	ua15.setUserName("Anita");
	ua15.setEmail("anita15@gmail.com");
	ua15.setPassword("Anita@123");
	ua15.setPhoneNumber("9876543210");
	ua15.setGender("Female");
	fb.createUserAccount(ua15);

	UserAccount ua16= new UserAccount();
	ua16.setId(16);
	ua16.setUserName("Suresh");
	ua16.setEmail("suresh16@gmail.com");
	ua16.setPassword("Suresh@123");
	ua16.setPhoneNumber("9876543211");
	ua16.setGender("Male");
	fb.createUserAccount(ua16);

	UserAccount ua17= new UserAccount();
	ua17.setId(17);
	ua17.setUserName("Divya");
	ua17.setEmail("divya17@gmail.com");
	ua17.setPassword("Divya@123");
	ua17.setPhoneNumber("9876543212");
	ua17.setGender("Female");
	fb.createUserAccount(ua17);

	UserAccount ua18= new UserAccount();
	ua18.setId(18);
	ua18.setUserName("Karthik");
	ua18.setEmail("karthik18@gmail.com");
	ua18.setPassword("Karthik@123");
	ua18.setPhoneNumber("9876543213");
	ua18.setGender("Male");
	fb.createUserAccount(ua18);

	UserAccount ua19= new UserAccount();
	ua19.setId(19);
	ua19.setUserName("Neha");
	ua19.setEmail("neha19@gmail.com");
	ua19.setPassword("Neha@123");
	ua19.setPhoneNumber("9876543214");
	ua19.setGender("Female");
	fb.createUserAccount(ua19);
	
	fb.getDetails();
	
	System.out.println("MAIN ENDED");
	}
 }
				