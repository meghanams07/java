class Ola {
    OlaRide r;

    public boolean bookRide(OlaRide r) {
        if (r.getId() > 0 &&
            r.getDriver() != null && !r.getDriver().isEmpty() &&
            r.getDestination() != null && !r.getDestination().isEmpty()) {

            this.r = r;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (r != null) {
            System.out.println(r.getId());
            System.out.println(r.getDriver());
            System.out.println(r.getDestination());
        }
    }
}