class InstagramRunner {
    public static void main(String[] args) {

        Instagram insta = new Instagram();

        InstagramAccount acc = new InstagramAccount();
        acc.setId(101);
        acc.setUsername("Keerthana");
        acc.setEmail("keerthana@gmail.com");

        boolean result = insta.createAccount(acc);
        System.out.println("Account created: " + result);

        insta.getDetails();
    }
}