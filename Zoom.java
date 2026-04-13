class Zoom {
    ZoomAccount acc;

    public boolean createAccount(ZoomAccount acc) {
        if (acc.getId() > 0 && acc.getUser() != null && !acc.getUser().isEmpty() &&
            acc.getMeetingId() != null && !acc.getMeetingId().isEmpty()) {
            this.acc = acc;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getUser());
            System.out.println(acc.getMeetingId());
        }
    }
}