class PhoneSettings {
 private int settingId;
 private String wifiName;
 private boolean bluetooth;
 private int brightness;
 private String mode;
 private int volume;
 private boolean airplaneMode;

 public void setSettingId(int settingId){
   this.settingId = settingId;
 }
 public int getSettingId(){
   return this.settingId;
 }

 public void setWifiName(String wifiName){
   this.wifiName = wifiName;
 }
 public String getWifiName(){
   return this.wifiName;
 }

 public void setBluetooth(boolean bluetooth){
   this.bluetooth = bluetooth;
 }
 public boolean getBluetooth(){
   return this.bluetooth;
 }

 public void setBrightness(int brightness){
   this.brightness = brightness;
 }
 public int getBrightness(){
   return this.brightness;
 }

 public void setMode(String mode){
   this.mode = mode;
 }
 public String getMode(){
   return this.mode;
 }

 public void setVolume(int volume){
   this.volume = volume;
 }
 public int getVolume(){
   return this.volume;
 }

 public void setAirplaneMode(boolean airplaneMode){
   this.airplaneMode = airplaneMode;
 }
 public boolean getAirplaneMode(){
   return this.airplaneMode;
 }
}