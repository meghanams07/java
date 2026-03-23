class PaymentRunner {
    public static void main(String[] args) {
        UpiPayment payment = new UpiPayment("UPI", 1500);
        payment.showPaymentDetails();
    }
}