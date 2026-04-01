class YouTubeVideoInfo {

 private int videoId;
 private String title;
 private String channelName;
 private int views;
 private int likes;
 private String duration;
 private boolean isLive;

 public void setVideoId(int videoId){
   this.videoId = videoId;
 }
 public int getVideoId(){
   return this.videoId;
 }

 public void setTitle(String title){
   this.title = title;
 }
 public String getTitle(){
   return this.title;
 }

 public void setChannelName(String channelName){
   this.channelName = channelName;
 }
 public String getChannelName(){
   return this.channelName;
 }

 public void setViews(int views){
   this.views = views;
 }
 public int getViews(){
   return this.views;
 }

 public void setLikes(int likes){
   this.likes = likes;
 }
 public int getLikes(){
   return this.likes;
 }

 public void setDuration(String duration){
   this.duration = duration;
 }
 public String getDuration(){
   return this.duration;
 }

 public void setIsLive(boolean isLive){
   this.isLive = isLive;
 }
 public boolean getIsLive(){
   return this.isLive;
 }
}