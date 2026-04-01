class GameInfoExecutor {
 public static void main(String[] args){

    System.out.println();
    GameInfo g1 = new GameInfo();
    g1.setGameId(1);
    System.out.println("Game Id:" +g1.getGameId());
    g1.setName("PUBG");
    System.out.println("Name:" +g1.getName());
    g1.setType("Battle Royale");
    System.out.println("Type:" +g1.getType());
    g1.setPlatform("Mobile");
    System.out.println("Platform:" +g1.getPlatform());
    g1.setPlayers(100);
    System.out.println("Players:" +g1.getPlayers());
    g1.setPrice(0);
    System.out.println("Price:" +g1.getPrice());
    g1.setIsOnline(true);
    System.out.println("Online:" +g1.getIsOnline());

    System.out.println();
    GameInfo g2 = new GameInfo();
    g2.setGameId(2);
    System.out.println("Game Id:" +g2.getGameId());
    g2.setName("GTA V");
    System.out.println("Name:" +g2.getName());
    g2.setType("Open World");
    System.out.println("Type:" +g2.getType());
    g2.setPlatform("PC");
    System.out.println("Platform:" +g2.getPlatform());
    g2.setPlayers(1);
    System.out.println("Players:" +g2.getPlayers());
    g2.setPrice(1500);
    System.out.println("Price:" +g2.getPrice());
    g2.setIsOnline(true);
    System.out.println("Online:" +g2.getIsOnline());

 }
}