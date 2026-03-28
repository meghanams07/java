class TelevisionExecutor {
    public static void main(String[] args) {

        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Zee TV");
        tv.addChannel("Sony TV");
        tv.addChannel("Colors TV");
        tv.addChannel("Sun TV");
        tv.addChannel("Vijay TV");
        tv.addChannel("Zee Tamil");
        tv.addChannel("Sun Music");
        tv.addChannel("Star Vijay Music");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Pogo");
        tv.addChannel("Discovery");
        tv.addChannel("National Geographic");
        tv.addChannel("Animal Planet");
        tv.addChannel("History TV18");
        tv.addChannel("Nickelodeon");
        tv.addChannel("DD National");

        tv.getChannels();

        System.out.println();

        int index = 6;
        String channel = tv.getChannelByIndex(index);
        if (channel != null) {
            System.out.println("The channel at index " + index + " is " + channel);
        }

        String channelName = "Sun TV";
        int i = tv.getIndexByChannelName(channelName);
        System.out.println("The channel " + channelName + " is at index " + i);
    }
}