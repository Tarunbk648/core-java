class Esp32 {
 private int deviceId;
 private String boardName;
 private int flashSize;
 private int ramSize;
 private boolean wifi;
 private boolean bluetooth;
 private double clockSpeed;

 public void setDeviceId(int deviceId){
   this.deviceId = deviceId;
 }
 public int getDeviceId(){
   return this.deviceId;
 }

 public void setBoardName(String boardName){
   this.boardName = boardName;
 }
 public String getBoardName(){
   return this.boardName;
 }

 public void setFlashSize(int flashSize){
   this.flashSize = flashSize;
 }
 public int getFlashSize(){
   return this.flashSize;
 }

 public void setRamSize(int ramSize){
   this.ramSize = ramSize;
 }
 public int getRamSize(){
   return this.ramSize;
 }

 public void setWifi(boolean wifi){
   this.wifi = wifi;
 }
 public boolean getWifi(){
   return this.wifi;
 }

 public void setBluetooth(boolean bluetooth){
   this.bluetooth = bluetooth;
 }
 public boolean getBluetooth(){
   return this.bluetooth;
 }

 public void setClockSpeed(double clockSpeed){
   this.clockSpeed = clockSpeed;
 }
 public double getClockSpeed(){
   return this.clockSpeed;
 }
}