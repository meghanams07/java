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

    public ProductionHouse(int houseId, String houseName, String founder, String location,
                          String city, String country, int establishedYear, int totalMovies,
                          String ceo, String category, String industry, String website,
                          String contact, String email, String colorTheme, int employees,
                          String studioType, String awards, String status, String famousMovie,
                          Movie movie) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.founder = founder;
        this.location = location;
        this.city = city;
        this.country = country;
        this.establishedYear = establishedYear;
        this.totalMovies = totalMovies;
        this.ceo = ceo;
        this.category = category;
        this.industry = industry;
        this.website = website;
        this.contact = contact;
        this.email = email;
        this.colorTheme = colorTheme;
        this.employees = employees;
        this.studioType = studioType;
        this.awards = awards;
        this.status = status;
        this.famousMovie = famousMovie;
        this.movie = movie;
    }

    public void getProductionHouseDetails() {
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
        System.out.println("----------------------------------------");
    }
}
