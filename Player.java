class Player {

    private int playerId;
    private String playerName;
    private String sport;
    private String team;
    private int age;
    private double salary;
    private String country;

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public int getPlayerId(){
        return this.playerId;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return this.sport;
    }

    public void setTeam(String team){
        this.team = team;
    }

    public String getTeam(){
        return this.team;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
}