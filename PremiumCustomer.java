class PremiumCustomer extends Customer {
    PremiumCustomer(String customerName, long phoneNumber) {
        super(customerName, phoneNumber);
        System.out.println("PremiumCustomer constructor");
    }
}