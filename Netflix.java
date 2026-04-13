class Netflix{
	Movie movies[] = new Movie[5];
	int index;
	
	public boolean addMovie(Movie movie){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isGenreValid = false;
		
		int id = movie.getMovieId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = movie.getMovieName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String genre = movie.getGenre();
		if(genre != null && !genre.isEmpty()){
			isGenreValid = true;
		}
		
		if(isIdValid && isNameValid && isGenreValid){
			if(index < movies.length){
				this.movies[index++] = movie;
				isAdded = true;
			}else{
				System.out.println("Netflix Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Movie m : movies){
			if(m != null){
				System.out.println(m.getMovieId()+" "+m.getMovieName()+" "+m.getGenre());
			}
		}
	}
}