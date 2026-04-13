class Gmail {

    GmailAccount acc;

    public boolean createAccount(GmailAccount acc) {

        if (acc.getId() > 0 && acc.getUsername() != null && !acc.getUsername().isEmpty() &&
            acc.getPassword() != null && !acc.getPassword().isEmpty()) {
            this.acc = acc;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getUsername());
            System.out.println(acc.getPassword());
        }
    }
}