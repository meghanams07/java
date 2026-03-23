class Customer {
    String customerName;
    long phoneNumber;

    Customer(String customerName, long phoneNumber) {
        System.out.println("Customer constructor");
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void showCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}