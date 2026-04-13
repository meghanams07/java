class UberRunner {
    public static void main(String[] args) {
        Uber u = new Uber();

        Ride r = new Ride();
        r.setRideId(11);
        r.setDriver("Ravi");
        r.setLocation("BTM");

        System.out.println(u.bookRide(r));
        u.getDetails();
    }
}