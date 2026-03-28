class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String place){
        boolean isValid = false;
        if(place != null && !place.isEmpty()){
            if(index < places.length){
                places[index] = place;
                index++;
                isValid = true;
            } else {
                System.out.println("Places list is full");
            }
        } else {
            System.out.println(place + " Not Valid");
        }
        return isValid;
    }

    public void displayPlaces(){
        System.out.println("\n--- Travel Places ---");
        for(String place : places){
            if(place != null){
                System.out.println(place);
            }
        }
    }

    public String getString(int index){
        String place = null;
        if(index < places.length){
            place = places[index];
            System.out.println(place);
            index++;
        } else System.out.println("Invalid");
        return place;
    }

    public int getIndex(String place){
        int index = 0;
        for(String p : places){
            if(p == place){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updatePlace(String existingPlace, String updatedPlace){
        boolean isUpdated = false;
        for(int index = 0; index < places.length; index++){
            if(places[index] == existingPlace){
                places[index] = updatedPlace;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Place Not Found");
        }
        return isUpdated;
    }

    public boolean deletePlace(String place){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < places.length; index++){
            if(places[index].equals(place)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < places.length - 1; j++){
                places[j] = places[j + 1];
            }
            places[places.length - 1] = null;
        }
        return isFound;
    }
}