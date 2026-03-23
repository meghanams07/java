class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        System.out.println("Order constructor");
        this.orderId = orderId;
        this.amount = amount;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
    }
}