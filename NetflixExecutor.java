class NetflixExecutor {
    public static void main(String[] args) {

        Netflix netflix = new Netflix();

        netflix.addWebSeries("Stranger Things");
        netflix.addWebSeries("Money Heist");
        netflix.addWebSeries("Dark");
        netflix.addWebSeries("Squid Game");
        netflix.addWebSeries("The Witcher");
        netflix.addWebSeries("Breaking Bad");
        netflix.addWebSeries("Lucifer");
        netflix.addWebSeries("Narcos");
        netflix.addWebSeries("The Crown");
        netflix.addWebSeries("You");
        netflix.addWebSeries("Wednesday");
        netflix.addWebSeries("Ozark");
        netflix.addWebSeries("Peaky Blinders");
        netflix.addWebSeries("Black Mirror");
        netflix.addWebSeries("Elite");
        netflix.addWebSeries("The Boys");
        netflix.addWebSeries("Vikings");
        netflix.addWebSeries("Friends");

        netflix.getWebSeries();

        System.out.println();

        int index = 3;
        String series = netflix.getWebSeriesByIndex(index);
        if (series != null) {
            System.out.println("The web series at index " + index + " is " + series);
        }

        String seriesName = "Dark";
        int i = netflix.getIndexByWebSeriesName(seriesName);
        System.out.println("The web series " + seriesName + " is at index " + i);
    }
}