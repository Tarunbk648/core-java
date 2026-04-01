class UserManual{

 private int manualId;
 private String title;
 private String description;
 private String version;
 private String author;

 public void setManualId(int manualId){
   this.manualId = manualId;
 }
 public int getManualId(){
   return this.manualId;
 }

 public void setTitle(String title){
   this.title = title;
 }
 public String getTitle(){
   return this.title;
 }

 public void setDescription(String description){
   this.description = description;
 }
 public String getDescription(){
   return this.description;
 }

 public void setVersion(String version){
   this.version = version;
 }
 public String getVersion(){
   return this.version;
 }

 public void setAuthor(String author){
   this.author = author;
 }
 public String getAuthor(){
   return this.author;
 }
}