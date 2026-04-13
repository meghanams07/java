class SnapchatRunner {
    public static void main(String[] args) {
        Snapchat s = new Snapchat();

        SnapchatAccount a = new SnapchatAccount();
        a.setId(7);
        a.setName("Nilav");
        a.setSnapId("snap07");

        System.out.println(s.createAccount(a));
        s.getDetails();
    }
}