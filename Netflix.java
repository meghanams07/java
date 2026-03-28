class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addSeries(String series){
        boolean isValid = false;
        if(series != null && !series.isEmpty()){
            if(index < webSeries.length){
                webSeries[index] = series;
                index++;
                isValid = true;
            } else {
                System.out.println("Series list is full");
            }
        } else {
            System.out.println(series + " Not Valid");
        }
        return isValid;
    }

    public void displaySeries(){
        System.out.println("\n--- Netflix Web Series ---");
        for(String series : webSeries){
            if(series != null){
                System.out.println(series);
            }
        }
    }

    public String getString(int index){
        String series = null;
        if(index < webSeries.length){
            series = webSeries[index];
            System.out.println(series);
            index++;
        } else System.out.println("Invalid");
        return series;
    }

    public int getIndex(String series){
        int index = 0;
        for(String s : webSeries){
            if(s == series){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateSeries(String existingSeries, String updatedSeries){
        boolean isUpdated = false;
        for(int index = 0; index < webSeries.length; index++){
            if(webSeries[index] == existingSeries){
                webSeries[index] = updatedSeries;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Series Not Found");
        }
        return isUpdated;
    }

    public boolean deleteSeries(String series){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < webSeries.length; index++){
            if(webSeries[index].equals(series)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < webSeries.length - 1; j++){
                webSeries[j] = webSeries[j + 1];
            }
            webSeries[webSeries.length - 1] = null;
        }
        return isFound;
    }
}