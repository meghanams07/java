class RailwayRunner {
    public static void main(String[] args) {

        Railway r = new Railway();

        TrainTicket t = new TrainTicket();
        t.setTicketId(77);
        t.setPassengerName("Megha");
        t.setSource("Bangalore");

        System.out.println(r.bookTicket(t));
        r.getDetails();
    }
}