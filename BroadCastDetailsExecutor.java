class BroadCastDetailsExecutor {
 public static void main(String[] args){
    System.out.println();
    BroadCastDetails b1 = new BroadCastDetails();
    b1.setBroadcastId(1);
    System.out.println("Broadcast Id:" +b1.getBroadcastId());
    b1.setChannelName("Star Sports");
    System.out.println("Channel:" +b1.getChannelName());
    b1.setProgramName("Cricket Match");
    System.out.println("Program:" +b1.getProgramName());
    b1.setTime("07:00 PM");
    System.out.println("Time:" +b1.getTime());
    b1.setLanguage("English");
    System.out.println("Language:" +b1.getLanguage());
    b1.setType("Sports");
    System.out.println("Type:" +b1.getType());
    b1.setIsLive(true);
    System.out.println("Live:" +b1.getIsLive());

    System.out.println();
    BroadCastDetails b2 = new BroadCastDetails();
    b2.setBroadcastId(2);
    System.out.println("Broadcast Id:" +b2.getBroadcastId());
    b2.setChannelName("Zee TV");
    System.out.println("Channel:" +b2.getChannelName());
    b2.setProgramName("Drama Serial");
    System.out.println("Program:" +b2.getProgramName());
    b2.setTime("08:00 PM");
    System.out.println("Time:" +b2.getTime());
    b2.setLanguage("Hindi");
    System.out.println("Language:" +b2.getLanguage());
    b2.setType("Entertainment");
    System.out.println("Type:" +b2.getType());
    b2.setIsLive(false);
    System.out.println("Live:" +b2.getIsLive());

 }
}