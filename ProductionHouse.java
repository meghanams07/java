class ProductionHouse {

    int houseId;
    String houseName;
    String founder;
    String location;
    String city;
    String country;
    int establishedYear;
    int totalMovies;
    String ceo;
    String category;
    String industry;
    String website;
    String contact;
    String email;
    String colorTheme;
    int employees;
    String studioType;
    String awards;
    String status;
    String famousMovie;

    Movie movie;

    public void getProductionHouseDetails(){

        System.out.println("HouseId: " + houseId);
        System.out.println("HouseName: " + houseName);
        System.out.println("Founder: " + founder);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("TotalMovies: " + totalMovies);
        System.out.println("CEO: " + ceo);
        System.out.println("Category: " + category);
        System.out.println("Industry: " + industry);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Employees: " + employees);
        System.out.println("StudioType: " + studioType);
        System.out.println("Awards: " + awards);
        System.out.println("Status: " + status);
        System.out.println("FamousMovie: " + famousMovie);

        this.movie.getMovieDetails();
    }
}