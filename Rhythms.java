class Rhythms {

    int rhythmId;
    String rhythmName;
    String origin;
    String genre;
    int tempo;
    String culture;
    String beatPattern;
    String instrumentType;
    int duration;
    String composer;
    int year;
    String language;
    String category;
    String mood;
    String stageType;
    String festival;
    String artist;
    String colorTheme;
    String status;
    String popularity;

    MusicInstrument musicInstrument;

    public void getRhythmDetails(){

        System.out.println("RhythmId: " + rhythmId);
        System.out.println("RhythmName: " + rhythmName);
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Tempo: " + tempo);
        System.out.println("Culture: " + culture);
        System.out.println("BeatPattern: " + beatPattern);
        System.out.println("InstrumentType: " + instrumentType);
        System.out.println("Duration: " + duration);
        System.out.println("Composer: " + composer);
        System.out.println("Year: " + year);
        System.out.println("Language: " + language);
        System.out.println("Category: " + category);
        System.out.println("Mood: " + mood);
        System.out.println("StageType: " + stageType);
        System.out.println("Festival: " + festival);
        System.out.println("Artist: " + artist);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Status: " + status);
        System.out.println("Popularity: " + popularity);

        this.musicInstrument.getMusicInstrumentDetails();
    }
}