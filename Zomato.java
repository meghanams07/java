class Zomato {
    ZomatoOrder order;

    public boolean createOrder(ZomatoOrder order) {
        if (order.getId() > 0 &&
            order.getFood() != null && !order.getFood().isEmpty() &&
            order.getCost() > 0) {

            this.order = order;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (order != null) {
            System.out.println(order.getId());
            System.out.println(order.getFood());
            System.out.println(order.getCost());
        }
    }
}
