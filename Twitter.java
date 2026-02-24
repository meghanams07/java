class Twitter {

    public static void register(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void register(String username, String email, String dob, String password) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("Password: " + password);
    }
}