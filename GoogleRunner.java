class GoogleRunner {
    public static void main(String[] args) {

        Google g = new Google();

        GoogleAccount a = new GoogleAccount();
        a.setId(1);
        a.setName("Nilav");
        a.setEmail("nilav@gmail.com");

        System.out.println(g.createAccount(a));
        g.getDetails();
    }
}