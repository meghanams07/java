class Paytm {
    PaytmAccount acc;

    public boolean createAccount(PaytmAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getBalance() >= 0) {
            this.acc = acc;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getBalance());
        }
    }
}