class Discord {
    DiscordAccount acc;

    public boolean createAccount(DiscordAccount acc) {
        if (acc.getId() > 0 && acc.getUsername() != null && !acc.getUsername().isEmpty() &&
            acc.getServer() != null && !acc.getServer().isEmpty()) {
            this.acc = acc;
            return true;
        }
        return false;
    }
    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getUsername());
            System.out.println(acc.getServer());
        }
    }
}
