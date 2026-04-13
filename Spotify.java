class Spotify{
	Song songs[] = new Song[5];
	int index;
	
	public boolean addSong(Song song){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isSingerValid = false;
		
		int id = song.getSongId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = song.getSongName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String singer = song.getSinger();
		if(singer != null && !singer.isEmpty()){
			isSingerValid = true;
		}
		
		if(isIdValid && isNameValid && isSingerValid){
			if(index < songs.length){
				this.songs[index++] = song;
				isAdded = true;
			}else{
				System.out.println("Spotify Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Song s : songs){
			if(s != null){
				System.out.println(s.getSongId()+" "+s.getSongName()+" "+s.getSinger());
			}
		}
	}
}