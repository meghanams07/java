class ZomatoRunner {
    public static void main(String[] args) {
        Zomato z = new Zomato();

        ZomatoOrder o = new ZomatoOrder();
        o.setId(2);
        o.setFood("Burger");
        o.setCost(150);

        System.out.println(z.createOrder(o));
        z.getDetails();
    }
}