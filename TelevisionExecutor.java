class TelevisionExecutor {
    public static void main(String[] args) {

        TelevisionManager manager = new TelevisionManager();

        manager.addChannel("Star Vijay");
        manager.addChannel("Sun TV");
        manager.addChannel("Zee Tamil");
        manager.addChannel("Colors Tamil");
        manager.addChannel("Kalaignar TV");
        manager.addChannel("Raj TV");
        manager.addChannel("Polimer TV");
        manager.addChannel("Jaya TV");
        manager.addChannel("Discovery Channel");
        manager.addChannel("National Geographic");
        manager.addChannel("Animal Planet");
        manager.addChannel("Cartoon Network");
        manager.addChannel("Pogo");
        manager.addChannel("Nickelodeon");
        manager.addChannel("Sony Entertainment");
        manager.addChannel("Star Sports");
        manager.addChannel("DD National");

        manager.getChannels();
    }
}