class Uber {
    Ride r;

    public boolean bookRide(Ride r) {
        if (r.getRideId() > 0 && r.getDriver() != null && !r.getDriver().isEmpty() &&
            r.getLocation() != null && !r.getLocation().isEmpty()) {

            this.r = r;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (r != null) {
            System.out.println(r.getRideId());
            System.out.println(r.getDriver());
            System.out.println(r.getLocation());
        }
    }
}
