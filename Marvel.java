class Marvel {
 private int heroId;
 private String name;
 private String superPower;
 private String team;
 private String weapon;
 private String planet;
 private boolean isAvenger;

 public void setHeroId(int heroId){
   this.heroId = heroId;
 }
 public int getHeroId(){
   return this.heroId;
 }

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return this.name;
 }

 public void setSuperPower(String superPower){
   this.superPower = superPower;
 }
 public String getSuperPower(){
   return this.superPower;
 }

 public void setTeam(String team){
   this.team = team;
 }
 public String getTeam(){
   return this.team;
 }

 public void setWeapon(String weapon){
   this.weapon = weapon;
 }
 public String getWeapon(){
   return this.weapon;
 }

 public void setPlanet(String planet){
   this.planet = planet;
 }
 public String getPlanet(){
   return this.planet;
 }

 public void setIsAvenger(boolean isAvenger){
   this.isAvenger = isAvenger;
 }
 public boolean getIsAvenger(){
   return this.isAvenger;
 }
}