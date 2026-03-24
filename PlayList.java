class PlayList{
 String[] songNames = new String[5];
 int index;
 
 public boolean addSong(String song){
   boolean isSongAdded=false;
   if(song!=null && !song.isEmpty()){
     songNames[index]=song;
	 index++;
	 isSongAdded=true;
	 }
	else{
	  System.out.println("List is full");
	  isSongAdded=false;
	  }
	 return isSongAdded;
	}
 
 public void getDetails(){
   System.out.println("Second song of the list is:" +songNames[2]);
   System.out.println("Fourth/Final song of the list is:" +songNames[4]);
   }
  
  PlayList(){
   System.out.println("PlayList Started........");
   }
   }
   