class Game{
	private int gameId;
	private String gameName;
	private String genre;
	
	public void setGameId(int gameId){
		this.gameId = gameId;
	}
	
	public void setGameName(String gameName){
		this.gameName = gameName;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public int getGameId(){
		return gameId;
	}
	
	public String getGameName(){
		return gameName;
	}
	
	public String getGenre(){
		return genre;
	}
}