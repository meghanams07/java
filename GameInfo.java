class GameInfo {

    private int gameId;
    private String gameName;
    private String genre;
    private String platform;
    private String developer;
    private String releaseYear;
    private String rating;
    private String mode;
    private String size;

    public void setGameId(int gameId){
        this.gameId = gameId;
    }

    public int getGameId(){
        return this.gameId;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public String getGameName(){
        return this.gameName;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }

    public String getPlatform(){
        return this.platform;
    }

    public void setDeveloper(String developer){
        this.developer = developer;
    }

    public String getDeveloper(){
        return this.developer;
    }

    public void setReleaseYear(String releaseYear){
        this.releaseYear = releaseYear;
    }

    public String getReleaseYear(){
        return this.releaseYear;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getRating(){
        return this.rating;
    }

    public void setMode(String mode){
        this.mode = mode;
    }

    public String getMode(){
        return this.mode;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }
}