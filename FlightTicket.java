class FlightTicket {
    private int ticketId;
    private String passengerName;
    private String destination;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getDestination() {
        return destination;
    }
}