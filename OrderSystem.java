class OrderSystem {

    public static void sendToKitchen(String dishName) {
        System.out.println("Sending order to kitchen");
        Kitchen.receiveOrder(dishName);
        System.out.println("Order sent successfully");
    }
}