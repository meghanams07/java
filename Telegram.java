class Telegram {
    TelegramAccount acc;

    public boolean createAccount(TelegramAccount acc) {
        if (acc.getId() > 0 && acc.getName() != null && !acc.getName().isEmpty() &&
            acc.getUsername() != null && !acc.getUsername().isEmpty()) {
            this.acc = acc;
            return true;
        }
        return false;
    }
    public void getDetails() {
        if (acc != null) {
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getUsername());
        }
    }
}