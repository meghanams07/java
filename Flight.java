class Flight {
    String flightName;
    String destination;

    Flight(String flightName, String destination) {
        System.out.println("Flight constructor");
        this.flightName = flightName;
        this.destination = destination;
    }

    public void showFlightDetails() {
        System.out.println("Flight: " + flightName);
        System.out.println("Destination: " + destination);
    }
}