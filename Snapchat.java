class Snapchat {
    SnapchatAccount acc;

    public boolean createAccount(SnapchatAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getSnapId() != null && !acc.getSnapId().isEmpty()) {
            this.acc = acc;
            return true;
        }
        return false;
    }
    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getSnapId());
        }
    }
}