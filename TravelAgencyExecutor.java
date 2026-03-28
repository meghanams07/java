class TravelAgencyExecutor {
    public static void main(String[] args) {
        TravelAgency travel = new TravelAgency();

        travel.addPlace("Paris");
        travel.addPlace("London");
        travel.addPlace("New York");
        travel.addPlace("Dubai");
        travel.addPlace("Singapore");
        travel.addPlace("Maldives");
        travel.addPlace("Bali");
        travel.addPlace("Goa");
        travel.addPlace("Kerala");
        travel.addPlace("Manali");
        travel.addPlace("Ooty");
        travel.addPlace("Mysore");
        travel.addPlace("Jaipur");
        travel.addPlace("Agra");
        travel.addPlace("Varanasi");
        travel.addPlace("Shimla");
        travel.addPlace("Darjeeling");

        travel.displayPlaces();

        System.out.println("\nGet Place by Index:");
        travel.getString(4);

        System.out.println("\nGet Index by Name:");
        travel.getIndex("Goa");

        System.out.println("\nUpdate Place:");
        travel.updatePlace("Ooty", "Ooty Hills");
        travel.displayPlaces();

        System.out.println("\nDelete Place:");
        travel.deletePlace("Dubai");
        travel.displayPlaces();
    }
}