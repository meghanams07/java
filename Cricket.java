class Cricket{
    String team;
    int players;
    String format;

    Cricket(){
        System.out.println("Cricket class Default constructor");
    }

    Cricket(String team,int players,String format){
        this.team = team;
        this.players = players;
        this.format = format;

        System.out.println(this.team+" "+this.players+" "+this.format);
    }
}