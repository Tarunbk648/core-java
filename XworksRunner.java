class XworksRunner{
public static void main(String[] args){
   Duration duration = new Duration(3);
   
   String[] courses= {"Core Java", "Web- Technology", "MySQL"};
   Course course = new Course(22, courses,duration);
  
   String[] branches={"Rajajinagar", "BTM Layout"};
   Xworks xworks = new Xworks("Sg22rom_Intern", 500, branches, course);
   
   xworks.getDetails();
}
}
   