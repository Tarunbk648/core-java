class AmazonExecutor{
	public static void main(String[] args){
		Amazon amazon = new Amazon();
		AmazonSubscription amazonsubcription = new AmazonSubscription();
		amazonsubcription.setId(1099);
		amazonsubcription.setName("Harish");
		amazonsubcription.setEmail("harish678@gmail.com");
		amazonsubcription.setPhoneNumber(9731046778L);
		amazonsubcription.setAddress("Bilugola");
		
		boolean ref= amazon.createAmazonAccount(amazonsubcription);
		System.out.println(ref);
		
		amazon.getDetails();
		
		
		AmazonSubscription amazonsubcription1 = new AmazonSubscription();
		amazonsubcription1.setId(1100);
		amazonsubcription1.setName("Harish");
		amazonsubcription1.setEmail("harish678@gmail.com");
		amazonsubcription1.setPhoneNumber(9731046778L);
		amazonsubcription1.setAddress("Bilugola");
		
		boolean ref1= amazon.createAmazonAccount(amazonsubcription1);
		System.out.println(ref1);
		
		amazon.getDetails();
		
		
		AmazonSubscription amazonsubcription2 = new AmazonSubscription();
		amazonsubcription2.setId(1101);
		amazonsubcription2.setName("Harish");
		amazonsubcription2.setEmail("harish678@gmail.com");
		amazonsubcription2.setPhoneNumber(9731046778L);
		amazonsubcription2.setAddress("Bilugola");
		
		boolean ref2= amazon.createAmazonAccount(amazonsubcription2);
		System.out.println(ref2);
		
		amazon.getDetails();
		
		
		AmazonSubscription amazonsubcription3 = new AmazonSubscription();
		amazonsubcription3.setId(1102);
		amazonsubcription3.setName("Harish");
		amazonsubcription3.setEmail("harish678@gmail.com");
		amazonsubcription3.setPhoneNumber(9731046778L);
		amazonsubcription3.setAddress("Bilugola");
		
		boolean ref3= amazon.createAmazonAccount(amazonsubcription3);
		System.out.println(ref3);
		
		amazon.getDetails();
		
		
		AmazonSubscription amazonsubcription4 = new AmazonSubscription();
		amazonsubcription4.setId(1103);
		amazonsubcription4.setName("Harish");
		amazonsubcription4.setEmail("harish678@gmail.com");
		amazonsubcription4.setPhoneNumber(9731046778L);
		amazonsubcription4.setAddress("Bilugola");
		
		boolean ref4= amazon.createAmazonAccount(amazonsubcription4);
		System.out.println(ref4);
		
		amazon.getDetails();
		
		AmazonSubscription amazonsubcription5 = new AmazonSubscription();
		amazonsubcription5.setId(1104);
		amazonsubcription5.setName("Harish");
		amazonsubcription5.setEmail("harish678@gmail.com");
		amazonsubcription5.setPhoneNumber(9731046778L);
		amazonsubcription5.setAddress("Bilugola");
		
		boolean ref5= amazon.createAmazonAccount(amazonsubcription5);
		System.out.println(ref5);
		
		amazon.getDetails();
		
		
	}

}