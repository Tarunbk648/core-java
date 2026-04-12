class FanExecutor{
 public static void main(String[] args){
   Fan fan = new Fan();
   fan.fanId=4;
   System.out.println("Fan Id externally:" +fan.fanId);
   
   Capacitor capacitor= new Capacitor();
   capacitor.capacitance=2.2;
   capacitor.voltageRating=300;
   capacitor.type="Electrolyte";
   capacitor.brand="Hawie";
   capacitor.tolerance=360;
   capacitor.isWorking=true;
   
   fan.capacitor=capacitor;  //Assiging custom reference to object reference

   
 
   boolean ref = fan.setData(1, capacitor);
   System.out.println("Is data added in a method:" +ref);
   
   fan.getDetails();
   }
 }