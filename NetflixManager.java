class NetflixManager {
    private String[] webSeries = new String[18];
    int index = 0;

    public boolean addWebSeries(String seriesName) {
        boolean isAdded = false;

        if (seriesName != null && !seriesName.isEmpty()) {
            if (index < webSeries.length) {
                webSeries[index] = seriesName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid series name");
        }

        return isAdded;
    }

    public void getWebSeries() {
        for (String series : webSeries) {
            System.out.println(series);
        }
    }
}