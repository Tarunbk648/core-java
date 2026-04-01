class TraineeInfoExecutor {
 public static void main(String[] args){

    System.out.println();
    TraineeInfo t1 = new TraineeInfo();
    t1.setTraineeId(1);
    System.out.println("Trainee Id:" +t1.getTraineeId());
    t1.setName("Ravi");
    System.out.println("Name:" +t1.getName());
    t1.setCourse("Java");
    System.out.println("Course:" +t1.getCourse());
    t1.setTrainer("Suresh");
    System.out.println("Trainer:" +t1.getTrainer());
    t1.setDuration(3);
    System.out.println("Duration (Months):" +t1.getDuration());
    t1.setBatch("Batch A");
    System.out.println("Batch:" +t1.getBatch());
    t1.setIsActive(true);
    System.out.println("Active:" +t1.getIsActive());

    System.out.println();
    TraineeInfo t2 = new TraineeInfo();
    t2.setTraineeId(2);
    System.out.println("Trainee Id:" +t2.getTraineeId());
    t2.setName("Sneha");
    System.out.println("Name:" +t2.getName());
    t2.setCourse("Python");
    System.out.println("Course:" +t2.getCourse());
    t2.setTrainer("Meena");
    System.out.println("Trainer:" +t2.getTrainer());
    t2.setDuration(4);
    System.out.println("Duration (Months):" +t2.getDuration());
    t2.setBatch("Batch B");
    System.out.println("Batch:" +t2.getBatch());
    t2.setIsActive(true);
    System.out.println("Active:" +t2.getIsActive());

 }
}