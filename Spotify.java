class Spotify {
    SpotifyAccount acc;

    public boolean createAccount(SpotifyAccount acc) {
        if (acc.getId() > 0 && acc.getUser() != null && !acc.getUser().isEmpty() &&
            acc.getPlan() != null && !acc.getPlan().isEmpty()) {

            this.acc = acc;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getUser());
            System.out.println(acc.getPlan());
        }
    }
}