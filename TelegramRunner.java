class TelegramRunner {
    public static void main(String[] args) {
        Telegram t = new Telegram();

        TelegramAccount a = new TelegramAccount();
        a.setId(6);
        a.setName("Megha");
        a.setUsername("@nilav");

        System.out.println(t.createAccount(a));
        t.getDetails();
    }
}