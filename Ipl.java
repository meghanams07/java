class Ipl {

    int teamId;
    String teamName;
    String captain;
    String coach;
    String homeGround;
    int championships;
    int playersCount;
    String owner;
    String city;
    String sponsor;
    int foundedYear;
    String color;
    String category;
    int matchesPlayed;
    int wins;
    int losses;
    int points;
    String status;
    String manager;
    String league;

    Player player;

    public void getIplDetails() {

        System.out.println("TeamId: " + teamId);
        System.out.println("TeamName: " + teamName);
        System.out.println("Captain: " + captain);
        System.out.println("Coach: " + coach);
        System.out.println("HomeGround: " + homeGround);
        System.out.println("Championships: " + championships);
        System.out.println("PlayersCount: " + playersCount);
        System.out.println("Owner: " + owner);
        System.out.println("City: " + city);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("FoundedYear: " + foundedYear);
        System.out.println("Color: " + color);
        System.out.println("Category: " + category);
        System.out.println("MatchesPlayed: " + matchesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Points: " + points);
        System.out.println("Status: " + status);
        System.out.println("Manager: " + manager);
        System.out.println("League: " + league);

        this.player.getPlayerDetails();
    }
}