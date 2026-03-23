class Courier {
    String trackingId;
    String destination;

    Courier(String trackingId, String destination) {
        System.out.println("Courier constructor");
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public void showCourierDetails() {
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Destination: " + destination);
    }
}
