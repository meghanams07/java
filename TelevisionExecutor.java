class TelevisionExecutor {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Zee TV");
        tv.addChannel("Colors TV");
        tv.addChannel("Sony TV");
        tv.addChannel("Sun TV");
        tv.addChannel("Udaya TV");
        tv.addChannel("Asianet");
        tv.addChannel("Star Vijay");
        tv.addChannel("ETV Telugu");
        tv.addChannel("Gemini TV");
        tv.addChannel("Star Sports");
        tv.addChannel("Sony Sports");
        tv.addChannel("Discovery Channel");
        tv.addChannel("National Geographic");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Pogo");
        tv.addChannel("Nickelodeon");

        tv.displayChannels();

        System.out.println("\nGet Channel by Index:");
        tv.getString(5);

        System.out.println("\nGet Index by Name:");
        tv.getIndex("Sun TV");

        System.out.println("\nUpdate Channel:");
        tv.updateChannel("Pogo", "Pogo Kids");
        tv.displayChannels();

        System.out.println("\nDelete Channel:");
        tv.deleteChannel("Nickelodeon");
        tv.displayChannels();
    }
}