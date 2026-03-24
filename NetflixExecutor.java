class NetflixExecutor {
    public static void main(String[] args) {

        NetflixManager manager = new NetflixManager();

        manager.addWebSeries("Stranger Things");
        manager.addWebSeries("Money Heist");
        manager.addWebSeries("Dark");
        manager.addWebSeries("Lucifer");
        manager.addWebSeries("Narcos");
        manager.addWebSeries("The Witcher");
        manager.addWebSeries("Wednesday");
        manager.addWebSeries("You");
        manager.addWebSeries("Elite");
        manager.addWebSeries("Squid Game");
        manager.addWebSeries("Breaking Bad");
        manager.addWebSeries("Peaky Blinders");
        manager.addWebSeries("The Crown");
        manager.addWebSeries("Ozark");
        manager.addWebSeries("Vikings");
        manager.addWebSeries("Manifest");
        manager.addWebSeries("Locke & Key");
        manager.addWebSeries("Shadow and Bone");

        manager.getWebSeries();
    }
}