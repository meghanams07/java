class Waiter {

    public static void takeOrder(String dishName) {
        System.out.println("Waiter taking order");
        OrderSystem.sendToKitchen(dishName);
        System.out.println("Waiter finished order process");
    }
}