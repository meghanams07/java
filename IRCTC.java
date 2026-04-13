class IRCTC {
    IRCTCAccount acc;

    public boolean createAccount(IRCTCAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getTrain() != null && !acc.getTrain().isEmpty()) {

            this.acc = acc;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getTrain());
        }
    }
}