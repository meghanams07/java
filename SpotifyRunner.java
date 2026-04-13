class SpotifyRunner {
    public static void main(String[] args) {
        Spotify s = new Spotify();

        SpotifyAccount a = new SpotifyAccount();
        a.setId(2);
        a.setUser("Nilav");
        a.setPlan("Premium");

        System.out.println(s.createAccount(a));
        s.getDetails();
    }
}