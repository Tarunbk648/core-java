class Course{
 int courseId;
 String[] courses;
 Duration duration;
 
 Course(int courseId, String[] courses, Duration duration){
   this.courseId=courseId;
   this.courses=courses;
   this.duration=duration;
   }
 
 public void getCourseDetails(){
   System.out.println("------ FETCHING A COURSE DETAILS ------>");
   System.out.println("The course Id is:" +this.courseId);
   System.out.println("List of courses");
   for(String courses: courses){
     System.out.println(courses);
	}
  this.duration.getDurationDetails();
  }
 }