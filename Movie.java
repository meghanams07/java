class Movie {
    String title;
    String language;

    Movie(String title, String language) {
        System.out.println("Movie constructor");
        this.title = title;
        this.language = language;
    }

    public void showMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Language: " + language);
    }
}