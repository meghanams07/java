class Railway {

    TrainTicket ticket;

    public boolean bookTicket(TrainTicket ticket) {

        if (ticket.getTicketId() > 0 && ticket.getPassengerName() != null && !ticket.getPassengerName().isEmpty() &&
            ticket.getSource() != null && !ticket.getSource().isEmpty()) {

            this.ticket = ticket;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (ticket != null) {
            System.out.println(ticket.getTicketId());
            System.out.println(ticket.getPassengerName());
            System.out.println(ticket.getSource());
        }
    }
}