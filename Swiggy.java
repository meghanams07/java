class Swiggy {
    Order order;

    public boolean createOrder(Order order) {
        if (order.getOrderId() > 0 && order.getItem() != null && !order.getItem().isEmpty() &&
            order.getPrice() > 0) {

            this.order = order;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (order != null) {
            System.out.println(order.getOrderId());
            System.out.println(order.getItem());
            System.out.println(order.getPrice());
        }
    }
}