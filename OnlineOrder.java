class OnlineOrder extends Order {
    OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
        System.out.println("OnlineOrder constructor");
    }
}