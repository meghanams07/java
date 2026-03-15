class Dance {

	int danceId;
	String danceName;
	String originCountry;
	String originState;
	String style;
	String musicType;
	String costume;
	String difficultyLevel;
	int performers;
	int duration;
	String famousArtist;
	String category;
	String stageType;
	String rhythm;
	String culture;
	String colorTheme;
	int year;
	String language;
	String instrument;
	String status;

	Form form;

	public void getDanceDetails(){

		System.out.println("DanceId: " + danceId);
		System.out.println("DanceName: " + danceName);
		System.out.println("OriginCountry: " + originCountry);
		System.out.println("OriginState: " + originState);
		System.out.println("Style: " + style);
		System.out.println("MusicType: " + musicType);
		System.out.println("Costume: " + costume);
		System.out.println("DifficultyLevel: " + difficultyLevel);
		System.out.println("Performers: " + performers);
		System.out.println("Duration: " + duration);
		System.out.println("FamousArtist: " + famousArtist);
		System.out.println("Category: " + category);
		System.out.println("StageType: " + stageType);
		System.out.println("Rhythm: " + rhythm);
		System.out.println("Culture: " + culture);
		System.out.println("ColorTheme: " + colorTheme);
		System.out.println("Year: " + year);
		System.out.println("Language: " + language);
		System.out.println("Instrument: " + instrument);
		System.out.println("Status: " + status);

		this.form.getFormDetails();
	}
}