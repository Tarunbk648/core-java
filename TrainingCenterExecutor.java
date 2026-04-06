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
		System.out.println("The data is validated:" +ref);
		
		trainingcenter.getDetails();
		
		System.out.println();
		TrainingCenterDescription tcd1= new TrainingCenterDescription();
		tcd1.setId("KG22ROM");
		tcd1.setCenterName("Dev");
		tcd1.setTrainerName("X-Workz");
		tcd1.setCourseName("Java");
		tcd1.setDuration("4 months");
		
		boolean ref1=trainingcenter.addTrainingCenterData(tcd1);
		System.out.println("The data is validated:" +ref1);
		
		trainingcenter.getDetails();
	}
}
		