public class Restaurant {

    public static void startService() {
        System.out.println("Restaurant service started");
        TableManager.seatGuest("Rahul", "Paneer Butter Masala");
        System.out.println("Restaurant service ended");
    }

    public static void main(String[] args) {
        startService();
    }
}