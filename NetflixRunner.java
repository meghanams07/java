class NetflixRunner{
	public static void main(String[] args){
		
		Netflix netflix = new Netflix();

		Movie m1 = new Movie();
		m1.setMovieId(1); m1.setMovieName("Movie1"); m1.setGenre("Action");
		netflix.addMovie(m1);

		Movie m2 = new Movie();
		m2.setMovieId(2); m2.setMovieName("Movie2"); m2.setGenre("Drama");
		netflix.addMovie(m2);

		Movie m3 = new Movie();
		m3.setMovieId(3); m3.setMovieName("Movie3"); m3.setGenre("Comedy");
		netflix.addMovie(m3);

		Movie m4 = new Movie();
		m4.setMovieId(4); m4.setMovieName("Movie4"); m4.setGenre("Horror");
		netflix.addMovie(m4);

		Movie m5 = new Movie();
		m5.setMovieId(5); m5.setMovieName("Movie5"); m5.setGenre("Action");
		netflix.addMovie(m5);

		Movie m6 = new Movie();
		m6.setMovieId(6); m6.setMovieName("Movie6"); m6.setGenre("Drama");
		netflix.addMovie(m6);

		Movie m7 = new Movie();
		m7.setMovieId(7); m7.setMovieName("Movie7"); m7.setGenre("Comedy");
		netflix.addMovie(m7);

		Movie m8 = new Movie();
		m8.setMovieId(8); m8.setMovieName("Movie8"); m8.setGenre("Horror");
		netflix.addMovie(m8);

		Movie m9 = new Movie();
		m9.setMovieId(9); m9.setMovieName("Movie9"); m9.setGenre("Action");
		netflix.addMovie(m9);

		Movie m10 = new Movie();
		m10.setMovieId(10); m10.setMovieName("Movie10"); m10.setGenre("Drama");
		netflix.addMovie(m10);

		Movie m11 = new Movie();
		m11.setMovieId(11); m11.setMovieName("Movie11"); m11.setGenre("Comedy");
		netflix.addMovie(m11);

		Movie m12 = new Movie();
		m12.setMovieId(12); m12.setMovieName("Movie12"); m12.setGenre("Horror");
		netflix.addMovie(m12);

		Movie m13 = new Movie();
		m13.setMovieId(13); m13.setMovieName("Movie13"); m13.setGenre("Action");
		netflix.addMovie(m13);

		Movie m14 = new Movie();
		m14.setMovieId(14); m14.setMovieName("Movie14"); m14.setGenre("Drama");
		netflix.addMovie(m14);

		Movie m15 = new Movie();
		m15.setMovieId(15); m15.setMovieName("Movie15"); m15.setGenre("Comedy");
		netflix.addMovie(m15);

		Movie m16 = new Movie();
		m16.setMovieId(16); m16.setMovieName("Movie16"); m16.setGenre("Horror");
		netflix.addMovie(m16);

		Movie m17 = new Movie();
		m17.setMovieId(17); m17.setMovieName("Movie17"); m17.setGenre("Action");
		netflix.addMovie(m17);

		Movie m18 = new Movie();
		m18.setMovieId(18); m18.setMovieName("Movie18"); m18.setGenre("Drama");
		netflix.addMovie(m18);

		Movie m19 = new Movie();
		m19.setMovieId(19); m19.setMovieName("Movie19"); m19.setGenre("Comedy");
		netflix.addMovie(m19);

		netflix.getDetails();
	}
}