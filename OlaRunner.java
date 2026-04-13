class OlaRunner {
    public static void main(String[] args) {
        Ola o = new Ola();

        OlaRide r = new OlaRide();
        r.setId(22);
        r.setDriver("Suresh");
        r.setDestination("Airport");

        System.out.println(o.bookRide(r));
        o.getDetails();
    }
}