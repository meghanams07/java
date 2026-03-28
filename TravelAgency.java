class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String place) {
        boolean isAdded = false;

        if (place != null && !place.isEmpty()) {
            if (index < places.length) {
                places[index++] = place;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(place + " is invalid place");
        }
        return isAdded;
    }

    public void getPlaces() {
        for (String p : places) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public String getPlaceByIndex(int index) {
        if (index < places.length && places[index] != null) {
            return places[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByPlaceName(String placeName) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].equals(placeName)) {
                return i;
            }
        }
        System.out.println("invalid place " + placeName);
        return -1;
    }
}