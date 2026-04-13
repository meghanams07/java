class FlightService {

    FlightTicket ticket;

    public boolean bookTicket(FlightTicket ticket) {

        if (ticket.getTicketId() > 0 && ticket.getPassengerName() != null && !ticket.getPassengerName().isEmpty() &&
            ticket.getDestination() != null && !ticket.getDestination().isEmpty()) {

            this.ticket = ticket;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (ticket != null) {
            System.out.println(ticket.getTicketId());
            System.out.println(ticket.getPassengerName());
            System.out.println(ticket.getDestination());
        }
    }
}