class BookMyShow {

    Ticket ticket;

    public boolean bookTicket(Ticket ticket) {

        if (ticket.getId() > 0 && ticket.getMovie() != null && !ticket.getMovie().isEmpty() &&
            ticket.getSeats() > 0) {

            this.ticket = ticket;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (ticket != null) {
            System.out.println(ticket.getId());
            System.out.println(ticket.getMovie());
            System.out.println(ticket.getSeats());
        }
    }
}