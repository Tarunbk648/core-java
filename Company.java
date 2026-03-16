class Company{
 int CompanyId;
 String CompanyName;
 String Founder;
 String[] department;
 Project project;
 
 Company(int CompanyId, String CompanyName, String Founder, String[] department,Project project){
	this.CompanyId=CompanyId;
	this.CompanyName=CompanyName;
	this.Founder=Founder;
	this.department=department;
	this.project=project;
	}
	
 public void getDetails(){
   System.out.println("-----------------------");
   System.out.println("FETCHING COMPANY DETAILS");
   System.out.println("The Company ID is:" +this.CompanyId);
   System.out.println("The Company name is:" +this.CompanyName);
   System.out.println("The Founder name is:" +this.Founder);
   System.out.println("List of department");
   for(String department:department){
      System.out.println(department);
	 }
	this.project.getProjectDetails();
	}
}