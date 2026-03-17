class Movie {
    int movieId;
    String movieName;
    String director;
    String hero;
    String heroine;
    String language;
    String genre;
    int duration;
    int releaseYear;
    String producer;
    String musicDirector;
    String cinematographer;
    String editor;
    String country;
    String platform;
    String rating;
    int budget;
    int boxOffice;
    String status;
    String award;

    public Movie(int movieId, String movieName, String director, String hero, 
                 String heroine, String language, String genre, int duration, 
                 int releaseYear, String producer, String musicDirector, 
                 String cinematographer, String editor, String country, 
                 String platform, String rating, int budget, int boxOffice, 
                 String status, String award) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.director = director;
        this.hero = hero;
        this.heroine = heroine;
        this.language = language;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.producer = producer;
        this.musicDirector = musicDirector;
        this.cinematographer = cinematographer;
        this.editor = editor;
        this.country = country;
        this.platform = platform;
        this.rating = rating;
        this.budget = budget;
        this.boxOffice = boxOffice;
        this.status = status;
        this.award = award;
    }

    public void getMovieDetails() {
        System.out.println("MovieId: " + movieId);
        System.out.println("MovieName: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration);
        System.out.println("ReleaseYear: " + releaseYear);
        System.out.println("Producer: " + producer);
        System.out.println("MusicDirector: " + musicDirector);
        System.out.println("Cinematographer: " + cinematographer);
        System.out.println("Editor: " + editor);
        System.out.println("Country: " + country);
        System.out.println("Platform: " + platform);
        System.out.println("Rating: " + rating);
        System.out.println("Budget: " + budget);
        System.out.println("BoxOffice: " + boxOffice);
        System.out.println("Status: " + status);
        System.out.println("Award: " + award);
    }
}