class Payment {
    String paymentMode;
    double amount;

    Payment(String paymentMode, double amount) {
        System.out.println("Payment constructor");
        this.paymentMode = paymentMode;
        this.amount = amount;
    }

    public void showPaymentDetails() {
        System.out.println("Mode: " + paymentMode);
        System.out.println("Amount: " + amount);
    }
}