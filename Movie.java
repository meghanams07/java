class Movie{
	private int movieId;
	private String movieName;
	private String genre;
	
	public void setMovieId(int movieId){
		this.movieId = movieId;
	}
	
	public void setMovieName(String movieName){
		this.movieName = movieName;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public int getMovieId(){
		return movieId;
	}
	
	public String getMovieName(){
		return movieName;
	}
	
	public String getGenre(){
		return genre;
	}
}