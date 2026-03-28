class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String series) {
        boolean isAdded = false;

        if (series != null && !series.isEmpty()) {
            if (index < webSeries.length) {
                webSeries[index++] = series;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(series + " is invalid web series");
        }
        return isAdded;
    }

    public void getWebSeries() {
        for (String series : webSeries) {
            if (series != null) {
                System.out.println(series);
            }
        }
    }

    public String getWebSeriesByIndex(int index) {
        if (index < webSeries.length && webSeries[index] != null) {
            return webSeries[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByWebSeriesName(String seriesName) {
        for (int i = 0; i < webSeries.length; i++) {
            if (webSeries[i] != null && webSeries[i].equals(seriesName)) {
                return i;
            }
        }
        System.out.println("invalid web series " + seriesName);
        return -1;
    }
}