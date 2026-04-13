class NetflixRunner {
    public static void main(String[] args) {
        Netflix n = new Netflix();

        Subscription s = new Subscription();
        s.setId(101);
        s.setPlan("Premium");
        s.setDuration(12);

        System.out.println(n.createSubscription(s));
        n.getDetails();
    }
}