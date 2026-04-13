class GmailRunner {
    public static void main(String[] args) {

        Gmail g = new Gmail();

        GmailAccount a = new GmailAccount();
        a.setId(2);
        a.setUsername("nilav123");
        a.setPassword("pass@123");

        System.out.println(g.createAccount(a));
        g.getDetails();
    }
}