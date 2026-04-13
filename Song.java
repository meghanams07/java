class Song{
	private int songId;
	private String songName;
	private String singer;
	
	public void setSongId(int songId){
		this.songId = songId;
	}
	
	public void setSongName(String songName){
		this.songName = songName;
	}
	
	public void setSinger(String singer){
		this.singer = singer;
	}
	
	public int getSongId(){
		return songId;
	}
	
	public String getSongName(){
		return songName;
	}
	
	public String getSinger(){
		return singer;
	}
}