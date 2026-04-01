class GameInfo {

 private int gameId;
 private String name;
 private String type;
 private String platform;
 private int players;
 private double price;
 private boolean isOnline;

 public void setGameId(int gameId){
   this.gameId = gameId;
 }
 public int getGameId(){
   return this.gameId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setType(String type){
   this.type = type;
 }
 public String getType(){
   return this.type;
 }

 public void setPlatform(String platform){
   this.platform = platform;
 }
 public String getPlatform(){
   return this.platform;
 }

 public void setPlayers(int players){
   this.players = players;
 }
 public int getPlayers(){
   return this.players;
 }

 public void setPrice(double price){
   this.price = price;
 }
 public double getPrice(){
   return this.price;
 }

 public void setIsOnline(boolean isOnline){
   this.isOnline = isOnline;
 }
 public boolean getIsOnline(){
   return this.isOnline;
 }
}