class SwiggyRunner {
    public static void main(String[] args) {
        Swiggy s = new Swiggy();

        Order o = new Order();
        o.setOrderId(1);
        o.setItem("Pizza");
        o.setPrice(250);

        System.out.println(s.createOrder(o));
        s.getDetails();
    }
}