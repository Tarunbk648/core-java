class Player {
 private int playerId;
 private String name;
 private String sport;
 private int age;
 private String team;
 private int matchesPlayed;
 private int score;

 public void setPlayerId(int playerId){
   this.playerId = playerId;
 }
 public int getPlayerId(){
   return this.playerId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setSport(String sport){
   this.sport = sport;
 }
 public String getSport(){
   return this.sport;
 }

 public void setAge(int age){
   this.age = age;
 }
 public int getAge(){
   return this.age;
 }

 public void setTeam(String team){
   this.team = team;
 }
 public String getTeam(){
   return this.team;
 }

 public void setMatchesPlayed(int matchesPlayed){
   this.matchesPlayed = matchesPlayed;
 }
 public int getMatchesPlayed(){
   return this.matchesPlayed;
 }

 public void setScore(int score){
   this.score = score;
 }
 public int getScore(){
   return this.score;
 }
}