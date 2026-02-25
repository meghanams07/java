class Movie{

    static String movieName;
    static String director;
    static double budget;
    static double rating;
    static int durationMinutes;
    static boolean isPanIndia;
    static String language;

    public static boolean createMovie(String name,String directors,double budgets, double ratings,int duration,boolean panIndia,String languages){

        boolean isMovieCreated = false;
        boolean isnameValid = false;
        boolean isdirectorValid = false;
        boolean isbudgetValid = false;
        boolean isratingValid = false;
        boolean isdurationValid = false;
        boolean ispanIndiaValid = false;
        boolean islanguageValid = false;

        if(name != null && name.length() >= 3){
            movieName = name;
            isnameValid = true;
        }else{
            System.out.println("Movie name is not valid");
        }

        if(directors != null && directors.length() >= 3){
            director = directors;
            isdirectorValid = true;
        }else{
            System.out.println("Director name is not valid");
        }

        if(budgets > 1 && budgets < 2000){
            budget = budgets;
            isbudgetValid = true;
        }else{
            System.out.println("Budget is not valid");
        }

        if(ratings >= 1.0 && ratings <= 10.0){
            rating = ratings;
            isratingValid = true;
        }else{
            System.out.println("Rating is not valid");
        }

        if(duration >= 60 && duration <= 300){
            durationMinutes = duration;
            isdurationValid = true;
        }else{
            System.out.println("Duration is not valid");
        }

        if(panIndia == true || panIndia == false){
            isPanIndia = panIndia;
            ispanIndiaValid = true;
        }

        if(languages != null && languages.length() >= 3){
            language = languages;
            islanguageValid = true;
        }else{
            System.out.println("Language is not valid");
        }

        if(isnameValid && isdirectorValid && isbudgetValid && isratingValid && isdurationValid && ispanIndiaValid && islanguageValid){
            isMovieCreated = true;
        }

        return isMovieCreated;
    };

    public static void getMovieDetails(){

        System.out.println("Movie Details are :");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Director : " + director);
        System.out.println("Budget (Crores) : " + budget);
        System.out.println("Rating : " + rating);
        System.out.println("Duration (Minutes) : " + durationMinutes);
        System.out.println("Pan India : " + isPanIndia);
        System.out.println("Language : " + language);
    };
}