class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger) {
        boolean isAdded = false;

        if (passenger != null && !passenger.isEmpty()) {
            if (index < passengers.length) {
                passengers[index++] = passenger;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(passenger + " is invalid passenger");
        }
        return isAdded;
    }

    public void getPassengers() {
        for (String p : passengers) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public String getPassengerByIndex(int index) {
        if (index < passengers.length && passengers[index] != null) {
            return passengers[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByPassengerName(String passengerName) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null && passengers[i].equals(passengerName)) {
                return i;
            }
        }
        System.out.println("invalid passenger " + passengerName);
        return -1;
    }
}