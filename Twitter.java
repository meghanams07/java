class Twitter {

    TwitterAccount acc;

    public boolean createAccount(TwitterAccount acc) {

        if (acc.getId() > 0 && acc.getUsername() != null && !acc.getUsername().isEmpty() &&
            acc.getFollowers() >= 0) {
            this.acc = acc;
            return true;
        }

        return false;
    }
    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getUsername());
            System.out.println(acc.getFollowers());
        }
    }
}