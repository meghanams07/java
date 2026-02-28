class Kitchen {

    public static void receiveOrder(String dishName) {
        System.out.println("Order received in kitchen");
        HeadChef.cook(dishName);
        System.out.println("Order processing completed in kitchen");
    }
}