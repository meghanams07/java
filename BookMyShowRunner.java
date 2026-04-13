class BookMyShowRunner {
    public static void main(String[] args) {

        BookMyShow b = new BookMyShow();

        Ticket t = new Ticket();
        t.setId(10);
        t.setMovie("Leo");
        t.setSeats(2);

        System.out.println(b.bookTicket(t));
        b.getDetails();
    }
}