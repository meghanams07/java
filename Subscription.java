class Subscription {
    String planName;
    int validity;

    Subscription(String planName, int validity) {
        System.out.println("Subscription constructor");
        this.planName = planName;
        this.validity = validity;
    }

    public void showSubscriptionDetails() {
        System.out.println("Plan: " + planName);
        System.out.println("Validity: " + validity + " days");
    }
}