class ApplicationInfo{
  private int appId;
  private String appName;
  private int version;
  private String downloades;
  
  public void setAppId(int Id){
    this.appId=Id;
  }
  
  public int getAppId(){
     return this.appId;
	 }
 
 public void setAppName(String appName){
    this.appName=appName;
	}
	
 public String getAppName(){
     return this.appName;
	}
	
 public void setVersion(int version){
	  this.version=version;
 }
 public int getVersion(){
	 return this.version;
 }
 public void setDownloades(String downloades){
	 this.downloades=downloades;
 }
 public String getDownloades(){
	 return this.downloades;
 }
}