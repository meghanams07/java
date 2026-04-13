class PhonePe {
    PhonePeAccount acc;

    public boolean createAccount(PhonePeAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getPhone() > 0) {
            this.acc = acc;
            return true;
        }
        return false;
    }
    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getPhone());
        }
    }
}