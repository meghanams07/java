class ExpressCourier extends Courier {
    ExpressCourier(String trackingId, String destination) {
        super(trackingId, destination);
        System.out.println("ExpressCourier constructor");
    }
}