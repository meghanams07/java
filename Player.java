class Player {
    int playerId;
    String playerName;
    String role;
    String country;
    int age;
    String battingStyle;
    String bowlingStyle;
    int jerseyNumber;
    int matches;
    int runs;
    int wickets;
    int catches;
    String team;
    int strikeRate;
    int economy;
    String category;
    int debutYear;
    String status;
    String experience;
    String awards;

    public Player(int playerId, String playerName, String role, String country, int age,
                  String battingStyle, String bowlingStyle, int jerseyNumber, int matches,
                  int runs, int wickets, int catches, String team, int strikeRate, 
                  int economy, String category, int debutYear, String status,
                  String experience, String awards) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.role = role;
        this.country = country;
        this.age = age;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.jerseyNumber = jerseyNumber;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.team = team;
        this.strikeRate = strikeRate;
        this.economy = economy;
        this.category = category;
        this.debutYear = debutYear;
        this.status = status;
        this.experience = experience;
        this.awards = awards;
    }

    public void getPlayerDetails() {
        System.out.println("PlayerId: " + playerId);
        System.out.println("PlayerName: " + playerName);
        System.out.println("Role: " + role);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
        System.out.println("BattingStyle: " + battingStyle);
        System.out.println("BowlingStyle: " + bowlingStyle);
        System.out.println("JerseyNumber: " + jerseyNumber);
        System.out.println("Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Catches: " + catches);
        System.out.println("Team: " + team);
        System.out.println("StrikeRate: " + strikeRate);
        System.out.println("Economy: " + economy);
        System.out.println("Category: " + category);
        System.out.println("DebutYear: " + debutYear);
        System.out.println("Status: " + status);
        System.out.println("Experience: " + experience);
        System.out.println("Awards: " + awards);
    }
}