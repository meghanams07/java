class GamingAppRunner{
	public static void main(String[] args){
		
		GamingApp app = new GamingApp();

		Game g1 = new Game();
		g1.setGameId(1); g1.setGameName("Game1"); g1.setGenre("Action");
		app.addGame(g1);

		Game g2 = new Game();
		g2.setGameId(2); g2.setGameName("Game2"); g2.setGenre("Adventure");
		app.addGame(g2);

		Game g3 = new Game();
		g3.setGameId(3); g3.setGameName("Game3"); g3.setGenre("Racing");
		app.addGame(g3);

		Game g4 = new Game();
		g4.setGameId(4); g4.setGameName("Game4"); g4.setGenre("Puzzle");
		app.addGame(g4);

		Game g5 = new Game();
		g5.setGameId(5); g5.setGameName("Game5"); g5.setGenre("Action");
		app.addGame(g5);

		Game g6 = new Game();
		g6.setGameId(6); g6.setGameName("Game6"); g6.setGenre("Adventure");
		app.addGame(g6);

		Game g7 = new Game();
		g7.setGameId(7); g7.setGameName("Game7"); g7.setGenre("Racing");
		app.addGame(g7);

		Game g8 = new Game();
		g8.setGameId(8); g8.setGameName("Game8"); g8.setGenre("Puzzle");
		app.addGame(g8);

		Game g9 = new Game();
		g9.setGameId(9); g9.setGameName("Game9"); g9.setGenre("Action");
		app.addGame(g9);

		Game g10 = new Game();
		g10.setGameId(10); g10.setGameName("Game10"); g10.setGenre("Adventure");
		app.addGame(g10);

		Game g11 = new Game();
		g11.setGameId(11); g11.setGameName("Game11"); g11.setGenre("Racing");
		app.addGame(g11);

		Game g12 = new Game();
		g12.setGameId(12); g12.setGameName("Game12"); g12.setGenre("Puzzle");
		app.addGame(g12);

		Game g13 = new Game();
		g13.setGameId(13); g13.setGameName("Game13"); g13.setGenre("Action");
		app.addGame(g13);

		Game g14 = new Game();
		g14.setGameId(14); g14.setGameName("Game14"); g14.setGenre("Adventure");
		app.addGame(g14);

		Game g15 = new Game();
		g15.setGameId(15); g15.setGameName("Game15"); g15.setGenre("Racing");
		app.addGame(g15);

		Game g16 = new Game();
		g16.setGameId(16); g16.setGameName("Game16"); g16.setGenre("Puzzle");
		app.addGame(g16);

		Game g17 = new Game();
		g17.setGameId(17); g17.setGameName("Game17"); g17.setGenre("Action");
		app.addGame(g17);

		Game g18 = new Game();
		g18.setGameId(18); g18.setGameName("Game18"); g18.setGenre("Adventure");
		app.addGame(g18);

		Game g19 = new Game();
		g19.setGameId(19); g19.setGameName("Game19"); g19.setGenre("Racing");
		app.addGame(g19);

		app.getDetails();
	}
}