class TravelAgencyManager {
    private String[] places = new String[17];
    int index = 0;

    public boolean addPlace(String placeName) {
        boolean isAdded = false;

        if (placeName != null && !placeName.isEmpty()) {
            if (index < places.length) {
                places[index] = placeName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Places list is full");
            }
        } else {
            System.out.println("Invalid place name");
        }

        return isAdded;
    }

    public void getPlaces() {
        for (String place : places) {
            if (place != null) {
                System.out.println(place);
            }
        }
    }
}

