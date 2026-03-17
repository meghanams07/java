class Form {
    int formId;
    String formName;
    String originPlace;
    String danceType;
    String costumeType;
    String music;
    String rhythm;
    String stage;
    String performerType;
    int performers;
    int duration;
    String difficulty;
    String culture;
    String instrument;
    String color;
    String category;
    String language;
    String tradition;
    int year;
    String status;

    public Form(int formId, String formName, String originPlace, String danceType,
                String costumeType, String music, String rhythm, String stage,
                String performerType, int performers, int duration, String difficulty,
                String culture, String instrument, String color, String category,
                String language, String tradition, int year, String status) {
        this.formId = formId;
        this.formName = formName;
        this.originPlace = originPlace;
        this.danceType = danceType;
        this.costumeType = costumeType;
        this.music = music;
        this.rhythm = rhythm;
        this.stage = stage;
        this.performerType = performerType;
        this.performers = performers;
        this.duration = duration;
        this.difficulty = difficulty;
        this.culture = culture;
        this.instrument = instrument;
        this.color = color;
        this.category = category;
        this.language = language;
        this.tradition = tradition;
        this.year = year;
        this.status = status;
    }

    public void displayDetails() {
        System.out.println("FormId: " + formId);
        System.out.println("FormName: " + formName);
        System.out.println("OriginPlace: " + originPlace);
        System.out.println("DanceType: " + danceType);
        System.out.println("CostumeType: " + costumeType);
        System.out.println("Music: " + music);
        System.out.println("Rhythm: " + rhythm);
        System.out.println("Stage: " + stage);
        System.out.println("PerformerType: " + performerType);
        System.out.println("Performers: " + performers);
        System.out.println("Duration: " + duration);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Culture: " + culture);
        System.out.println("Instrument: " + instrument);
        System.out.println("Color: " + color);
        System.out.println("Category: " + category);
        System.out.println("Language: " + language);
        System.out.println("Tradition: " + tradition);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
    }
}