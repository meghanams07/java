class InternationalFlight extends Flight {
    InternationalFlight(String flightName, String destination) {
        super(flightName, destination);
        System.out.println("InternationalFlight constructor");
    }
}