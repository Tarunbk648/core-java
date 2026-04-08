class PassportExecutor{
	public static void main(String[] args){
		PassportSeva passportseva= new PassportSeva();
		PassPortSevaRegistration ppr= new PassPortSevaRegistration();
		ppr.setId(1022);
		ppr.setName("Yusuf");
		ppr.setDob("04-09-2004");
		ppr.setResident(true);
		ppr.setGender("male");
		ppr.setAddress("Rajajinagar");
		
		boolean ref=passportseva.createPassportSevaAccount(ppr);
		System.out.println("Is account created:" +ref);
		
		PassPortSevaRegistration ppr2= new PassPortSevaRegistration();
		ppr2.setId(2045);
		ppr2.setName("Arjun");
		ppr2.setDob("15-02-2003");
		ppr2.setResident(true);
		ppr2.setGender("male");
		ppr2.setAddress("Indiranagar");
		passportseva.createPassportSevaAccount(ppr2);
	
		PassPortSevaRegistration ppr3= new PassPortSevaRegistration();
		ppr3.setId(3098);
		ppr3.setName("Rahul");
		ppr3.setDob("21-07-2002");
		ppr3.setResident(false);
		ppr3.setGender("male");
		ppr3.setAddress("Whitefield");
		passportseva.createPassportSevaAccount(ppr3);
		
		
		PassPortSevaRegistration ppr4= new PassPortSevaRegistration();
		ppr4.setId(4120);
		ppr4.setName("Sneha");
		ppr4.setDob("10-11-2004");
		ppr4.setResident(true);
		ppr4.setGender("female");
		ppr4.setAddress("Jayanagar");
		
		passportseva.createPassportSevaAccount(ppr4);
		
		PassPortSevaRegistration ppr5= new PassPortSevaRegistration();
		ppr5.setId(6789);
		ppr5.setName("Kiran");
		ppr5.setDob("05-06-2001");
		ppr5.setResident(true);
		ppr5.setGender("male");
		ppr5.setAddress("Malleshwaram");
		passportseva.createPassportSevaAccount(ppr5);
		
		
		PassPortSevaRegistration ppr6= new PassPortSevaRegistration();
		ppr6.setId(6790);
		ppr6.setName("Ravi");
		ppr6.setDob("12-08-2000");
		ppr6.setResident(true);
		ppr6.setGender("male");
		ppr6.setAddress("Yelahanka");
		passportseva.createPassportSevaAccount(ppr6);

		PassPortSevaRegistration ppr7= new PassPortSevaRegistration();
		ppr7.setId(6791);
		ppr7.setName("Meena");
		ppr7.setDob("22-01-2002");
		ppr7.setResident(false);
		ppr7.setGender("female");
		ppr7.setAddress("Hebbal");
		passportseva.createPassportSevaAccount(ppr7);

		PassPortSevaRegistration ppr8= new PassPortSevaRegistration();
		ppr8.setId(6792);
		ppr8.setName("Suresh");
		ppr8.setDob("09-03-2001");
		ppr8.setResident(true);
		ppr8.setGender("male");
		ppr8.setAddress("Marathahalli");
		passportseva.createPassportSevaAccount(ppr8);

		PassPortSevaRegistration ppr9= new PassPortSevaRegistration();
		ppr9.setId(6793);
		ppr9.setName("Divya");
		ppr9.setDob("17-05-2003");
		ppr9.setResident(true);
		ppr9.setGender("female");
		ppr9.setAddress("KR Puram");
		passportseva.createPassportSevaAccount(ppr9);

		PassPortSevaRegistration ppr10= new PassPortSevaRegistration();
		ppr10.setId(6794);
		ppr10.setName("Naveen");
		ppr10.setDob("30-12-2000");
		ppr10.setResident(false);
		ppr10.setGender("male");
		ppr10.setAddress("Banashankari");
		passportseva.createPassportSevaAccount(ppr10);

		PassPortSevaRegistration ppr11= new PassPortSevaRegistration();
		ppr11.setId(6795);
		ppr11.setName("Pooja");
		ppr11.setDob("14-02-2004");
		ppr11.setResident(true);
		ppr11.setGender("female");
		ppr11.setAddress("Electronic City");
		passportseva.createPassportSevaAccount(ppr11);

		PassPortSevaRegistration ppr12= new PassPortSevaRegistration();
		ppr12.setId(6796);
		ppr12.setName("Ajay");
		ppr12.setDob("06-06-2001");
		ppr12.setResident(true);
		ppr12.setGender("male");
		ppr12.setAddress("Sarjapur");
		passportseva.createPassportSevaAccount(ppr12);

		PassPortSevaRegistration ppr13= new PassPortSevaRegistration();
		ppr13.setId(6797);
		ppr13.setName("Kavya");
		ppr13.setDob("19-09-2002");
		ppr13.setResident(false);
		ppr13.setGender("female");
		ppr13.setAddress("Bellandur");
		passportseva.createPassportSevaAccount(ppr13);

		PassPortSevaRegistration ppr14= new PassPortSevaRegistration();
		ppr14.setId(6798);
		ppr14.setName("Vikram");
		ppr14.setDob("25-11-2000");
		ppr14.setResident(true);
		ppr14.setGender("male");
		ppr14.setAddress("Majestic");
		passportseva.createPassportSevaAccount(ppr14);

		PassPortSevaRegistration ppr15= new PassPortSevaRegistration();
		ppr15.setId(6799);
		ppr15.setName("Anita");
		ppr15.setDob("08-04-2003");
		ppr15.setResident(true);
		ppr15.setGender("female");
		ppr15.setAddress("Basavanagudi");
		passportseva.createPassportSevaAccount(ppr15);

		PassPortSevaRegistration ppr16= new PassPortSevaRegistration();
		ppr16.setId(6800);
		ppr16.setName("Manoj");
		ppr16.setDob("11-10-2001");
		ppr16.setResident(false);
		ppr16.setGender("male");
		ppr16.setAddress("BTM Layout");
		passportseva.createPassportSevaAccount(ppr16);

		PassPortSevaRegistration ppr17= new PassPortSevaRegistration();
		ppr17.setId(6801);
		ppr17.setName("Shreya");
		ppr17.setDob("03-07-2002");
		ppr17.setResident(true);
		ppr17.setGender("female");
		ppr17.setAddress("JP Nagar");
		passportseva.createPassportSevaAccount(ppr17);

		PassPortSevaRegistration ppr18= new PassPortSevaRegistration();
		ppr18.setId(6802);
		ppr18.setName("Karthik");
		ppr18.setDob("27-01-2000");
		ppr18.setResident(true);
		ppr18.setGender("male");
		ppr18.setAddress("RR Nagar");
		passportseva.createPassportSevaAccount(ppr18);

		PassPortSevaRegistration ppr19= new PassPortSevaRegistration();
		ppr19.setId(6803);
		ppr19.setName("Neha");
		ppr19.setDob("16-12-2003");
		ppr19.setResident(false);
		ppr19.setGender("female");
		ppr19.setAddress("HSR Layout");
		passportseva.createPassportSevaAccount(ppr19);
		
		
		passportseva.getDetails();
		
		System.out.println("MAIN ENDED");

	}
}