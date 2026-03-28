class NetflixExecutor {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        netflix.addSeries("Money Heist");
        netflix.addSeries("Stranger Things");
        netflix.addSeries("Dark");
        netflix.addSeries("Squid Game");

        netflix.displaySeries();

        System.out.println("\nGet Series by Index:");
        netflix.getString(2);

        System.out.println("\nGet Index by Name:");
        netflix.getIndex("Dark");

        System.out.println("\nUpdate Series:");
        netflix.updateSeries("Dark", "Dark Season 1");
        netflix.displaySeries();

        System.out.println("\nDelete Series:");
        netflix.deleteSeries("Squid Game");
        netflix.displaySeries();
    }
}