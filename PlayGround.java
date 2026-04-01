class PlayGround {
 private int groundId;
 private String name;
 private String location;
 private String type;
 private int capacity;
 private boolean isOpen;
 private String surface;

 public void setGroundId(int groundId){
   this.groundId = groundId;
 }
 public int getGroundId(){
   return this.groundId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setLocation(String location){
   this.location = location;
 }
 public String getLocation(){
   return this.location;
 }

 public void setType(String type){
   this.type = type;
 }
 public String getType(){
   return this.type;
 }

 public void setCapacity(int capacity){
   this.capacity = capacity;
 }
 public int getCapacity(){
   return this.capacity;
 }

 public void setIsOpen(boolean isOpen){
   this.isOpen = isOpen;
 }
 public boolean getIsOpen(){
   return this.isOpen;
 }

 public void setSurface(String surface){
   this.surface = surface;
 }
 public String getSurface(){
   return this.surface;
 }
}