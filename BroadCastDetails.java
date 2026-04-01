class BroadCastDetails {
 private int broadcastId;
 private String channelName;
 private String programName;
 private String time;
 private String language;
 private String type;
 private boolean isLive;

 public void setBroadcastId(int broadcastId){
   this.broadcastId = broadcastId;
 }
 public int getBroadcastId(){
   return this.broadcastId;
 }

 public void setChannelName(String channelName){
   this.channelName = channelName;
 }
 public String getChannelName(){
   return this.channelName;
 }

 public void setProgramName(String programName){
   this.programName = programName;
 }
 public String getProgramName(){
   return this.programName;
 }

 public void setTime(String time){
   this.time = time;
 }
 public String getTime(){
   return this.time;
 }

 public void setLanguage(String language){
   this.language = language;
 }
 public String getLanguage(){
   return this.language;
 }

 public void setType(String type){
   this.type = type;
 }
 public String getType(){
   return this.type;
 }

 public void setIsLive(boolean isLive){
   this.isLive = isLive;
 }
 public boolean getIsLive(){
   return this.isLive;
 }
}