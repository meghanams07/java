class YouTubeRunner {
    public static void main(String[] args) {
        YouTube y = new YouTube();

        Channel c = new Channel();
        c.setId(1);
        c.setName("Nilav Tech");
        c.setSubscribers(1000);

        System.out.println(y.createChannel(c));
        y.getDetails();
    }
}





































