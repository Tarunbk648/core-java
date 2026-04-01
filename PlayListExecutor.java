class PlayListExecutor{
 public static void main(String[] args){
   PlayList playlist = new PlayList();
   // playlist.addSong("Ranavikrama");
   // playlist.addSong("Chuttamalle");
   // playlist.addSong("Tum Hi Ho");
   
   
   // playlist.getDetails();
   
   // playlist.getNameByIndex(2);
   
   // playlist.getIndexByName("Ranavikrama");

   // playlist.UpdatedName("Ranavikrama", "Gajakesari");

   // playlist.deletePlaylist("Gajakesari");

   playlist.getDetails();

   String[] songs={"Ranavikrama", "Chuttamelle", "Tum Hi Ho"};
   boolean songNames=playlist.createSongNames(songs);
   System.out.println("Song names:" +songNames);
   
  }
 }
