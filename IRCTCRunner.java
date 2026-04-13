class IRCTCRunner {
    public static void main(String[] args) {
        IRCTC i = new IRCTC();

        IRCTCAccount a = new IRCTCAccount();
        a.setId(1);
        a.setName("Nilav");
        a.setTrain("Express");

        System.out.println(i.createAccount(a));
        i.getDetails();
    }
}