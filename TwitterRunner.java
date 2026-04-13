class TwitterRunner {
    public static void main(String[] args) {

        Twitter t = new Twitter();

        TwitterAccount a = new TwitterAccount();
        a.setId(4);
        a.setUsername("nilav_tweet");
        a.setFollowers(500);

        System.out.println(t.createAccount(a));
        t.getDetails();
    }
}