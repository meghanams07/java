class AirAsiaManager {
    private String[] passengers = new String[30];
    int index = 0;

    public boolean addPassenger(String passengerName) {
        boolean isAdded = false;

        if (passengerName != null && !passengerName.isEmpty()) {
            if (index < passengers.length) {
                passengers[index] = passengerName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Passenger list is full");
            }
        } else {
            System.out.println("Invalid passenger name");
        }

        return isAdded;
    }

    public void getPassengers() {
        for (String passenger : passengers) {
            if (passenger != null) {
                System.out.println(passenger);
            }
        }
    }
}

