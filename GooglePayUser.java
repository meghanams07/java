class GooglePayUser {

    static void createAccount(String name, String upiId, String bank){
        System.out.println("Name: " + name);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank: " + bank);
    }

    public static void main(String[] args){
        createAccount("Meghana","meghana@okaxis","SBI");
    }
}
