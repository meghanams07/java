class UpiPayment extends Payment {
    UpiPayment(String paymentMode, double amount) {
        super(paymentMode, amount);
        System.out.println("UpiPayment constructor");
    }
}