class ZoomRunner {
    public static void main(String[] args) {
        Zoom z = new Zoom();

        ZoomAccount a = new ZoomAccount();
        a.setId(5);
        a.setUser("Nilav");
        a.setMeetingId("Z123");

        System.out.println(z.createAccount(a));
        z.getDetails();
    }
}