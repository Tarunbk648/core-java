class CompanyRunner{
public static void main(String[] args){
   String[] technologies={"Java", "Spring boot","Web technology", "MySQL"};
   Project project = new Project(1004, "Bank management System", "Finance", technologies);
   String[] department={"Development", "Testing", "HR"};
   Company company = new Company(504, "Infosys", "N.R. Narayana Murthy", department,project);
   company.getDetails();
   
   String[] technologies1={"Java", "Hibernate","Web technology", "MySQL"};
   Project project1 = new Project(1002, "Hospital management System", "Healthcare", technologies1);
   String[] department1={"Cloud", "Development", "AI"};
   Company company1 = new Company(502, "TCS", "J.R.D. Tata", department1,project1);
   company1.getDetails();
   
   
   }
  }
   