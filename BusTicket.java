class BusTicket extends Ticket {
    BusTicket(String ticketNumber, double price) {
        super(ticketNumber, price);
        System.out.println("BusTicket constructor");
    }
}