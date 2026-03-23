class PremiumSubscription extends Subscription {
    PremiumSubscription(String planName, int validity) {
        super(planName, validity);
        System.out.println("PremiumSubscription constructor");
    }
}