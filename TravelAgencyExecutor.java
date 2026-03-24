class TravelAgencyExecutor {
    public static void main(String[] args) {

        TravelAgencyManager manager = new TravelAgencyManager();

        manager.addPlace("Goa");
        manager.addPlace("Ooty");
        manager.addPlace("Manali");
        manager.addPlace("Kashmir");
        manager.addPlace("Mysore");
        manager.addPlace("Coorg");
        manager.addPlace("Kerala");
        manager.addPlace("Andaman");
        manager.addPlace("Jaipur");
        manager.addPlace("Udaipur");
        manager.addPlace("Delhi");
        manager.addPlace("Agra");
        manager.addPlace("Ladakh");
        manager.addPlace("Shimla");
        manager.addPlace("Darjeeling");
        manager.addPlace("Rishikesh");
        manager.addPlace("Varanasi");

        manager.getPlaces();
    }
}