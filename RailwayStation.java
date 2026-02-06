class RailwayStation {
    public static void main(String[] args) {
        String name = "Bangalore City Junction";
        String location = "Bangalore";
        String stationMaster = "Suresh";

        String platforms[] = {"Platform 1", "Platform 2", "Platform 3", "Platform 4"};
        String trains[] = {"Shatabdi Express", "Rajdhani Express", "Mysore Express"};

        System.out.println("The Railway Station Information is:");
        System.out.println("Station Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Station Master: " + stationMaster);

        for(String platform : platforms) {
            System.out.println("Available Platform: " + platform);
        }

        for(String train : trains) {
            System.out.println("Train Running: " + train);
        }
    }
}
