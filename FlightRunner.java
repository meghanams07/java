class FlightRunner {
    public static void main(String[] args) {

        FlightService service = new FlightService();

        FlightTicket t = new FlightTicket();
        t.setTicketId(1);
        t.setPassengerName("Meghana");
        t.setDestination("Chennai");

        System.out.println(service.bookTicket(t));
        service.getDetails();
    }
}