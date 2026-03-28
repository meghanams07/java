class TravelAgencyExecutor {
    public static void main(String[] args) {

        TravelAgency agency = new TravelAgency();

        agency.addPlace("Goa");
        agency.addPlace("Manali");
        agency.addPlace("Ooty");
        agency.addPlace("Mysore");
        agency.addPlace("Coorg");
        agency.addPlace("Kodaikanal");
        agency.addPlace("Kerala");
        agency.addPlace("Jaipur");
        agency.addPlace("Udaipur");
        agency.addPlace("Delhi");
        agency.addPlace("Agra");
        agency.addPlace("Varanasi");
        agency.addPlace("Shimla");
        agency.addPlace("Darjeeling");
        agency.addPlace("Andaman");
        agency.addPlace("Ladakh");
        agency.addPlace("Rishikesh");

        agency.getPlaces();

        System.out.println();

        int index = 4;
        String place = agency.getPlaceByIndex(index);
        if (place != null) {
            System.out.println("The place at index " + index + " is " + place);
        }

        String placeName = "Goa";
        int i = agency.getIndexByPlaceName(placeName);
        System.out.println("The place " + placeName + " is at index " + i);
    }
}