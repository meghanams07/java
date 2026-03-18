class ComedyShow {

    int showId;
    String showName;
    String hostName;
    String location;
    int duration;
    int audienceCount;
    String language;
    String genre;
    double ticketPrice;
    String sponsor;
    int season;
    int episode;
    String comedian1;
    String comedian2;
    String comedian3;
    boolean isLive;
    String channel;
    double rating;
    String time;
    String day;

    public ComedyShow() {
        this(1, "Laugh Riot");
        System.out.println("Default Constructor");
    }

    public ComedyShow(int showId, String showName) {
        this(showId, showName, "Kapil Sharma", "Mumbai", 60);
        System.out.println("2-parameter Constructor");
    }

    public ComedyShow(int showId, String showName, String hostName, String location, int duration) {
        this.showId = showId;
        this.showName = showName;
        this.hostName = hostName;
        this.location = location;
        this.duration = duration;
        this.audienceCount = 200;
        this.language = "Hindi";
        this.genre = "Standup";
        this.ticketPrice = 500.0;
        this.sponsor = "Sony";
        this.season = 1;
        this.episode = 1;
        this.comedian1 = "Comedian A";
        this.comedian2 = "Comedian B";
        this.comedian3 = "Comedian C";
        this.isLive = true;
        this.channel = "Sony TV";
        this.rating = 4.5;
        this.time = "9 PM";
        this.day = "Saturday";
        System.out.println("Full Constructor");
    }

    public void displayDetails() {
        System.out.println(showId + " " + showName + " " + hostName + " " + location + " " + duration);
        System.out.println(audienceCount + " " + language + " " + genre + " " + ticketPrice + " " + sponsor);
        System.out.println(season + " " + episode + " " + comedian1 + " " + comedian2 + " " + comedian3);
        System.out.println(isLive + " " + channel + " " + rating + " " + time + " " + day);
    }
}

