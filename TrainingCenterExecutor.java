class TrainingCenterExecutor{
	public static void main(String[] args){
		TrainingCenter trainingcenter= new TrainingCenter();
		TrainingCenterDescription tcd= new TrainingCenterDescription();
		tcd.setId("SG22ROM");
		tcd.setCenterName("Dev");
		tcd.setTrainerName("X-Workz");
		tcd.setCourseName("Java");
		tcd.setDuration("4 months");
		boolean ref=trainingcenter.addTrainingCenterData(tcd);
		System.out.println("IS Data is validated:" +ref);
		
		TrainingCenterDescription tcd1= new TrainingCenterDescription();
		tcd1.setId("KG22ROM");
		tcd1.setCenterName("Dev");
		tcd1.setTrainerName("X-Workz");
		tcd1.setCourseName("Java");
		tcd1.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd1);
		
		TrainingCenterDescription tcd2= new TrainingCenterDescription();
		tcd2.setId("KR22ROM");
		tcd2.setCenterName("Dev");
		tcd2.setTrainerName("X-Workz");
		tcd2.setCourseName("Java");
		tcd2.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd2);
		
		TrainingCenterDescription tcd3= new TrainingCenterDescription();
		tcd3.setId("KM22ROM");
		tcd3.setCenterName("Dev");
		tcd3.setTrainerName("X-Workz");
		tcd3.setCourseName("Java");
		tcd3.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd3);
		trainingcenter.getDetails();
	
		TrainingCenterDescription tcd4= new TrainingCenterDescription();
		tcd4.setId("KM22ROM");
		tcd4.setCenterName("Dev");
		tcd4.setTrainerName("X-Workz");
		tcd4.setCourseName("Java");
		tcd4.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd4);
		
		TrainingCenterDescription tcd5= new TrainingCenterDescription();
		tcd5.setId("KM22ROM");
		tcd5.setCenterName("Dev");
		tcd5.setTrainerName("X-Workz");
		tcd5.setCourseName("Java");
		tcd5.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd5);
		
		TrainingCenterDescription tcd6= new TrainingCenterDescription();
		tcd6.setId("AA22ROM");
		tcd6.setCenterName("TechZone");
		tcd6.setTrainerName("Ravi");
		tcd6.setCourseName("Python");
		tcd6.setDuration("3 months");
		trainingcenter.addTrainingCenterData(tcd6);

		TrainingCenterDescription tcd7= new TrainingCenterDescription();
		tcd7.setId("BB22ROM");
		tcd7.setCenterName("SkillHub");
		tcd7.setTrainerName("Priya");
		tcd7.setCourseName("Web Development");
		tcd7.setDuration("5 months");
		trainingcenter.addTrainingCenterData(tcd7);

		TrainingCenterDescription tcd8= new TrainingCenterDescription();
		tcd8.setId("CC22ROM");
		tcd8.setCenterName("CodeLab");
		tcd8.setTrainerName("Kiran");
		tcd8.setCourseName("C++");
		tcd8.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd8);

		TrainingCenterDescription tcd9= new TrainingCenterDescription();
		tcd9.setId("DD22ROM");
		tcd9.setCenterName("NextGen");
		tcd9.setTrainerName("Sneha");
		tcd9.setCourseName("Data Science");
		tcd9.setDuration("6 months");
		trainingcenter.addTrainingCenterData(tcd9);

		TrainingCenterDescription tcd10= new TrainingCenterDescription();
		tcd10.setId("EE22ROM");
		tcd10.setCenterName("FutureTech");
		tcd10.setTrainerName("Ajay");
		tcd10.setCourseName("AI");
		tcd10.setDuration("6 months");
		trainingcenter.addTrainingCenterData(tcd10);

		TrainingCenterDescription tcd11= new TrainingCenterDescription();
		tcd11.setId("FF22ROM");
		tcd11.setCenterName("DevHub");
		tcd11.setTrainerName("Pooja");
		tcd11.setCourseName("JavaScript");
		tcd11.setDuration("3 months");
		trainingcenter.addTrainingCenterData(tcd11);

		TrainingCenterDescription tcd12= new TrainingCenterDescription();
		tcd12.setId("GG22ROM");
		tcd12.setCenterName("LearnPro");
		tcd12.setTrainerName("Manoj");
		tcd12.setCourseName("SQL");
		tcd12.setDuration("2 months");
		trainingcenter.addTrainingCenterData(tcd12);

		TrainingCenterDescription tcd13= new TrainingCenterDescription();
		tcd13.setId("HH22ROM");
		tcd13.setCenterName("BrightPath");
		tcd13.setTrainerName("Kavya");
		tcd13.setCourseName("Cloud Computing");
		tcd13.setDuration("5 months");
		trainingcenter.addTrainingCenterData(tcd13);

		TrainingCenterDescription tcd14= new TrainingCenterDescription();
		tcd14.setId("II22ROM");
		tcd14.setCenterName("EduTech");
		tcd14.setTrainerName("Vikram");
		tcd14.setCourseName("Cyber Security");
		tcd14.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd14);

		TrainingCenterDescription tcd15= new TrainingCenterDescription();
		tcd15.setId("JJ22ROM");
		tcd15.setCenterName("SkillForge");
		tcd15.setTrainerName("Anita");
		tcd15.setCourseName("UI/UX");
		tcd15.setDuration("3 months");
		trainingcenter.addTrainingCenterData(tcd15);

		TrainingCenterDescription tcd16= new TrainingCenterDescription();
		tcd16.setId("KK22ROM");
		tcd16.setCenterName("CodeMaster");
		tcd16.setTrainerName("Suresh");
		tcd16.setCourseName("Android");
		tcd16.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd16);

		TrainingCenterDescription tcd17= new TrainingCenterDescription();
		tcd17.setId("LL22ROM");
		tcd17.setCenterName("TechBridge");
		tcd17.setTrainerName("Divya");
		tcd17.setCourseName("Machine Learning");
		tcd17.setDuration("6 months");
		trainingcenter.addTrainingCenterData(tcd17);

		TrainingCenterDescription tcd18= new TrainingCenterDescription();
		tcd18.setId("MM22ROM");
		tcd18.setCenterName("FutureSkills");
		tcd18.setTrainerName("Karthik");
		tcd18.setCourseName("React");
		tcd18.setDuration("3 months");
		trainingcenter.addTrainingCenterData(tcd18);

		TrainingCenterDescription tcd19= new TrainingCenterDescription();
		tcd19.setId("NN22ROM");
		tcd19.setCenterName("NextLevel");
		tcd19.setTrainerName("Neha");
		tcd19.setCourseName("Spring Boot");
		tcd19.setDuration("4 months");
		trainingcenter.addTrainingCenterData(tcd19);
		
		trainingcenter.getDetails();
		
		System.out.println("MAIN ENDED");
	
	}
}
		