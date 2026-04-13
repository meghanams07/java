class WhatsAppRunner {
    public static void main(String[] args) {

        WhatsApp w = new WhatsApp();

        WhatsAppAccount a = new WhatsAppAccount();
        a.setId(3);
        a.setName("Megha");
        a.setPhone(9876543210L);

        System.out.println(w.createAccount(a));
        w.getDetails();
    }
}