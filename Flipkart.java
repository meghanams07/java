class Flipkart {
    FlipkartAccount acc;

    public boolean createAccount(FlipkartAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getAddress() != null && !acc.getAddress().isEmpty()) {

            this.acc = acc;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getAddress());
        }
    }
}
