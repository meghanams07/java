class Netflix {
    Subscription sub;

    public boolean createSubscription(Subscription sub) {
        if (sub.getId() > 0 &&
            sub.getPlan() != null && !sub.getPlan().isEmpty() &&
            sub.getDuration() > 0) {

            this.sub = sub;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (sub != null) {
            System.out.println(sub.getId());
            System.out.println(sub.getPlan());
            System.out.println(sub.getDuration());
        }
    }
}
