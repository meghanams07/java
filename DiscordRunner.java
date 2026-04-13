class DiscordRunner {
    public static void main(String[] args) {
        Discord d = new Discord();

        DiscordAccount a = new DiscordAccount();
        a.setId(8);
        a.setUsername("nilav_dev");
        a.setServer("Java");

        System.out.println(d.createAccount(a));
        d.getDetails();
    }
}