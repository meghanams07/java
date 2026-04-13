class SpotifyRunner{
	public static void main(String[] args){
		
		Spotify spotify = new Spotify();

		Song s1 = new Song();
		s1.setSongId(1); s1.setSongName("Song1"); s1.setSinger("Singer1");
		spotify.addSong(s1);

		Song s2 = new Song();
		s2.setSongId(2); s2.setSongName("Song2"); s2.setSinger("Singer2");
		spotify.addSong(s2);

		Song s3 = new Song();
		s3.setSongId(3); s3.setSongName("Song3"); s3.setSinger("Singer3");
		spotify.addSong(s3);

		Song s4 = new Song();
		s4.setSongId(4); s4.setSongName("Song4"); s4.setSinger("Singer4");
		spotify.addSong(s4);

		Song s5 = new Song();
		s5.setSongId(5); s5.setSongName("Song5"); s5.setSinger("Singer5");
		spotify.addSong(s5);

		Song s6 = new Song();
		s6.setSongId(6); s6.setSongName("Song6"); s6.setSinger("Singer6");
		spotify.addSong(s6);

		Song s7 = new Song();
		s7.setSongId(7); s7.setSongName("Song7"); s7.setSinger("Singer7");
		spotify.addSong(s7);

		Song s8 = new Song();
		s8.setSongId(8); s8.setSongName("Song8"); s8.setSinger("Singer8");
		spotify.addSong(s8);

		Song s9 = new Song();
		s9.setSongId(9); s9.setSongName("Song9"); s9.setSinger("Singer9");
		spotify.addSong(s9);

		Song s10 = new Song();
		s10.setSongId(10); s10.setSongName("Song10"); s10.setSinger("Singer10");
		spotify.addSong(s10);

		Song s11 = new Song();
		s11.setSongId(11); s11.setSongName("Song11"); s11.setSinger("Singer11");
		spotify.addSong(s11);

		Song s12 = new Song();
		s12.setSongId(12); s12.setSongName("Song12"); s12.setSinger("Singer12");
		spotify.addSong(s12);

		Song s13 = new Song();
		s13.setSongId(13); s13.setSongName("Song13"); s13.setSinger("Singer13");
		spotify.addSong(s13);

		Song s14 = new Song();
		s14.setSongId(14); s14.setSongName("Song14"); s14.setSinger("Singer14");
		spotify.addSong(s14);

		Song s15 = new Song();
		s15.setSongId(15); s15.setSongName("Song15"); s15.setSinger("Singer15");
		spotify.addSong(s15);

		Song s16 = new Song();
		s16.setSongId(16); s16.setSongName("Song16"); s16.setSinger("Singer16");
		spotify.addSong(s16);

		Song s17 = new Song();
		s17.setSongId(17); s17.setSongName("Song17"); s17.setSinger("Singer17");
		spotify.addSong(s17);

		Song s18 = new Song();
		s18.setSongId(18); s18.setSongName("Song18"); s18.setSinger("Singer18");
		spotify.addSong(s18);

		Song s19 = new Song();
		s19.setSongId(19); s19.setSongName("Song19"); s19.setSinger("Singer19");
		spotify.addSong(s19);

		spotify.getDetails();
	}
}