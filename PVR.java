class PVR {

    String theatreName;
    String location;
    String city;
    int screens;
    int totalSeats;
    String movieName;
    String showTime;
    double ticketPrice;
    String screenType;
    boolean foodCourt;
    boolean parking;
    String soundSystem;
    String seatType;
    String language;
    String movieGenre;
    int movieDuration;
    String rating;
    String bookingMode;
    String ownerCompany;
    boolean available;

    PVR(String theatreName, String location, String city, int screens, int totalSeats,
        String movieName, String showTime, double ticketPrice, String screenType,
        boolean foodCourt, boolean parking, String soundSystem, String seatType,
        String language, String movieGenre, int movieDuration, String rating,
        String bookingMode, String ownerCompany, boolean available) {

        this.theatreName = theatreName;
        this.location = location;
        this.city = city;
        this.screens = screens;
        this.totalSeats = totalSeats;
        this.movieName = movieName;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
        this.screenType = screenType;
        this.foodCourt = foodCourt;
        this.parking = parking;
        this.soundSystem = soundSystem;
        this.seatType = seatType;
        this.language = language;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
        this.rating = rating;
        this.bookingMode = bookingMode;
        this.ownerCompany = ownerCompany;
        this.available = available;
    }

    void display() {

        System.out.println("Theatre Name : " + this.theatreName);
        System.out.println("Location : " + this.location);
        System.out.println("City : " + this.city);
        System.out.println("Screens : " + this.screens);
        System.out.println("Total Seats : " + this.totalSeats);
        System.out.println("Movie Name : " + this.movieName);
        System.out.println("Show Time : " + this.showTime);
        System.out.println("Ticket Price : " + this.ticketPrice);
        System.out.println("Screen Type : " + this.screenType);
        System.out.println("Food Court : " + this.foodCourt);
        System.out.println("Parking : " + this.parking);
        System.out.println("Sound System : " + this.soundSystem);
        System.out.println("Seat Type : " + this.seatType);
        System.out.println("Language : " + this.language);
        System.out.println("Movie Genre : " + this.movieGenre);
        System.out.println("Movie Duration : " + this.movieDuration);
        System.out.println("Rating : " + this.rating);
        System.out.println("Booking Mode : " + this.bookingMode);
        System.out.println("Owner Company : " + this.ownerCompany);
        System.out.println("Available : " + this.available);
        System.out.println("-----------------------------------");
    }
}