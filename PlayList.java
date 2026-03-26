class PlayList{
 String[] songNames = new String[18];
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
	  
	  }
	 return isSongAdded;
	}
 
 public void getDetails(){
    System.out.println("List of songs");
   for(String songnames: songNames){
	   if(songnames!=null){
	   System.out.println(songnames);
   }
   }
 }
  
  PlayList(){
   System.out.println("PlayList Started........");
   }
   
   public String getNameByIndex(int index){
	   String name=null;
	   if(index<songNames.length){
		 name=songNames[index];
		 System.out.println("The name is at index" +index+ " is " +name);
		}
		else System.out.println("Invalid index");
		return name;
   }
   
   public int getIndexByName(String name){
	    int index=0;
		for(String names:songNames){
			if(names!=null && names==name){
				System.out.println("The " +name+ " is at index" +index);
				return index;
			}
			index++;
		}
		System.out.println("Inavlid name");
		return -1;
   }
}
   