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
		System.out.println(ref);
		
		passportseva.getDetails();
		
		Sytsem.out.println();
		PassPortSevaRegistration ppr2= new PassPortSevaRegistration();
		ppr2.setId(1023);
		ppr2.setName("Yusuf");
		ppr2.setDob("04-09-2004");
		ppr2.setResident(true);
		ppr2.setGender("male");
		ppr2.setAddress("Rajajinagar");
		
		boolean ref2=passportseva.createPassportSevaAccount(ppr2);
		System.out.println(ref2);
		
		passportseva.getDetails();
		
		
		Sytsem.out.println();
		PassPortSevaRegistration ppr3= new PassPortSevaRegistration();
		ppr3.setId(1024);
		ppr3.setName("Yusuf");
		ppr3.setDob("04-09-2004");
		ppr3.setResident(true);
		ppr3.setGender("male");
		ppr3.setAddress("Rajajinagar");
		
		boolean ref3=passportseva.createPassportSevaAccount(ppr3);
		System.out.println(ref3);
		
		passportseva.getDetails();
		
		
		Sytsem.out.println();
		PassPortSevaRegistration ppr4= new PassPortSevaRegistration();
		ppr4.setId(1025);
		ppr4.setName("Yusuf");
		ppr4.setDob("04-09-2004");
		ppr4.setResident(true);
		ppr4.setGender("male");
		ppr4.setAddress("Rajajinagar");
		
		boolean ref4=passportseva.createPassportSevaAccount(ppr4);
		System.out.println(ref4);
		
		passportseva.getDetails();
		
		
		Sytsem.out.println();
		PassPortSevaRegistration ppr5= new PassPortSevaRegistration();
		ppr5.setId(1026);
		ppr5.setName("Yusuf");
		ppr5.setDob("04-09-2004");
		ppr5.setResident(true);
		ppr5.setGender("male");
		ppr5.setAddress("Rajajinagar");
		
		boolean ref5=passportseva.createPassportSevaAccount(ppr5);
		System.out.println(ref5);
		
		passportseva.getDetails();

	}
}