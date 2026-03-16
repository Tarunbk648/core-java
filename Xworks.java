class Xworks{
 String batchId;
 int distanceFromPg;
 String[] branches;
 Course course;
 
 Xworks(String batchId, int distanceFromPg, String[] branches, Course course){
   this.batchId=batchId;
   this.distanceFromPg=distanceFromPg;
   this.branches=branches;
   this.course=course;
   }
   
  public void getDetails(){
	System.out.println("------ FETCHING A COMPANY DETAILS ------>");
    System.out.println("The batch Id is:" +this.batchId);
	System.out.println("Distance from pg:" +this.distanceFromPg);
	System.out.println("List of branches");
	for(String branches:branches){
	  System.out.println(branches);
	 }
	 this.course.getCourseDetails();
	 }
 }