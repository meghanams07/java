class GamingApp{
	Game games[] = new Game[5];
	int index;
	
	public boolean addGame(Game game){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isGenreValid = false;
		
		int id = game.getGameId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = game.getGameName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String genre = game.getGenre();
		if(genre != null && !genre.isEmpty()){
			isGenreValid = true;
		}
		
		if(isIdValid && isNameValid && isGenreValid){
			if(index < games.length){
				this.games[index++] = game;
				isAdded = true;
			}else{
				System.out.println("GamingApp Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Game g : games){
			if(g != null){
				System.out.println(g.getGameId()+" "+g.getGameName()+" "+g.getGenre());
			}
		}
	}
}