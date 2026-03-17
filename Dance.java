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

    public Dance(int danceId, String danceName, String originCountry, String originState, 
                 String style, String musicType, String costume, String difficultyLevel,
                 int performers, int duration, String famousArtist, String category,
                 String stageType, String rhythm, String culture, String colorTheme,
                 int year, String language, String instrument, String status, Form form) {
        this.danceId = danceId;
        this.danceName = danceName;
        this.originCountry = originCountry;
        this.originState = originState;
        this.style = style;
        this.musicType = musicType;
        this.costume = costume;
        this.difficultyLevel = difficultyLevel;
        this.performers = performers;
        this.duration = duration;
        this.famousArtist = famousArtist;
        this.category = category;
        this.stageType = stageType;
        this.rhythm = rhythm;
        this.culture = culture;
        this.colorTheme = colorTheme;
        this.year = year;
        this.language = language;
        this.instrument = instrument;
        this.status = status;
        this.form = form;
    }

    public void displayDetails() {
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
        this.form.displayDetails();
    }
}
