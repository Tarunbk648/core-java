class Project{
 int projectId;
 String projectName;
 String projectDomain;
 String[] technologies;
 
 Project(int projectId, String projectName, String projectDomain, String[] technologies){
    this.projectId=projectId;
	this.projectName=projectName;
	this.technologies=technologies;
	}
	
 public void getProjectDetails(){
   System.out.print("------");
   System.out.println("FETCHING PROJECT DETAILS ------");
   System.out.println("The Project ID is:" +this.projectId);
   System.out.println("The Project Name is:" +this.projectName);
   System.out.println("List of technologies used");
   for(String technologies:technologies){
     System.out.println(technologies);
	 }
   }
 }