class ApplicationExecutor{
 public static void main(String[] app){
  ApplicationInfo applicationinfo = new ApplicationInfo();
  applicationinfo.setAppId(22);
  int id=applicationinfo.getAppId();
  System.out.println("App Id is:" +id);
  
  applicationinfo.setAppName("GTA");
  String appName= applicationinfo.getAppName();
  System.out.println("App Name is:" +appName);
  
  applicationinfo.setVersion(13);
  int version=applicationinfo.getVersion();
  System.out.println("App version:" +version);
  
  applicationinfo.setDownloades("200M");
   String downloades=applicationinfo.getDownloades();
  System.out.println("App downloades:" +downloades);
  
  }
}
  