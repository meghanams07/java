class Ticket {
    String ticketNumber;
    double price;

    Ticket(String ticketNumber, double price) {
        System.out.println("Ticket constructor");
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public void showTicketDetails() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: " + price);
    }
}