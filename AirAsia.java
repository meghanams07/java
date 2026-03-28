class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger){
        boolean isValid = false;
        if(passenger != null && !passenger.isEmpty()){
            if(index < passengers.length){
                passengers[index] = passenger;
                index++;
                isValid = true;
            } else {
                System.out.println("Passenger list is full");
            }
        } else {
            System.out.println(passenger + " Not Valid");
        }
        return isValid;
    }

    public void displayPassengers(){
        System.out.println("\n--- AirAsia Passengers ---");
        for(String passenger : passengers){
            if(passenger != null){
                System.out.println(passenger);
            }
        }
    }

    public String getString(int index){
        String passenger = null;
        if(index < passengers.length){
            passenger = passengers[index];
            System.out.println(passenger);
            index++;
        } else System.out.println("Invalid");
        return passenger;
    }

    public int getIndex(String passenger){
        int index = 0;
        for(String p : passengers){
            if(p == passenger){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updatePassenger(String existingPassenger, String updatedPassenger){
        boolean isUpdated = false;
        for(int index = 0; index < passengers.length; index++){
            if(passengers[index] == existingPassenger){
                passengers[index] = updatedPassenger;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Passenger Not Found");
        }
        return isUpdated;
    }

    public boolean deletePassenger(String passenger){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < passengers.length; index++){
            if(passengers[index].equals(passenger)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < passengers.length - 1; j++){
                passengers[j] = passengers[j + 1];
            }
            passengers[passengers.length - 1] = null;
        }
        return isFound;
    }
}