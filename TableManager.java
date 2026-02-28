class TableManager {

    public static void seatGuest(String guestName, String dishName) {
        System.out.println("Guest seated: " + guestName);
        Waiter.takeOrder(dishName);
        System.out.println("Service completed for " + guestName);
    }
}