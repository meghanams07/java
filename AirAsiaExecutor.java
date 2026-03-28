class AirAsiaExecutor {
    public static void main(String[] args) {

        AirAsia airAsia = new AirAsia();

        airAsia.addPassenger("Arun");
        airAsia.addPassenger("Priya");
        airAsia.addPassenger("Rahul");
        airAsia.addPassenger("Sneha");
        airAsia.addPassenger("Karthik");
        airAsia.addPassenger("Ananya");
        airAsia.addPassenger("Vikram");
        airAsia.addPassenger("Meena");
        airAsia.addPassenger("Rohit");
        airAsia.addPassenger("Divya");
        airAsia.addPassenger("Sanjay");
        airAsia.addPassenger("Pooja");
        airAsia.addPassenger("Ajay");
        airAsia.addPassenger("Neha");
        airAsia.addPassenger("Manoj");
        airAsia.addPassenger("Kavya");
        airAsia.addPassenger("Varun");
        airAsia.addPassenger("Deepika");
        airAsia.addPassenger("Arjun");
        airAsia.addPassenger("Nisha");
        airAsia.addPassenger("Surya");
        airAsia.addPassenger("Keerthi");
        airAsia.addPassenger("Yash");
        airAsia.addPassenger("Aishwarya");
        airAsia.addPassenger("Ramesh");
        airAsia.addPassenger("Lakshmi");
        airAsia.addPassenger("Harish");
        airAsia.addPassenger("Swathi");
        airAsia.addPassenger("Ganesh");
        airAsia.addPassenger("Bhavnclass State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highway) {
        boolean isAdded = false;

        if (highway != null && !highway.isEmpty()) {
            if (index < highwayNames.length) {
                highwayNames[index++] = highway;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(highway + " is invalid highway");
        }
        return isAdded;
    }

    public void getHighways() {
        for (String hw : highwayNames) {
            if (hw != null) {
                System.out.println(hw);
            }
        }
    }

    public String getHighwayByIndex(int index) {
        if (index < highwayNames.length && highwayNames[index] != null) {
            return highwayNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByHighwayName(String highwayName) {
        for (int i = 0; i < highwayNames.length; i++) {
            if (highwayNames[i] != null && highwayNames[i].equals(highwayName)) {
                return i;
            }
        }
        System.out.println("invalid highway " + highwayName);
        return -1;
    }
}ana");

        airAsia.getPassengers();

        System.out.println();

        int index = 10;
        String passenger = airAsia.getPassengerByIndex(index);
        if (passenger != null) {
            System.out.println("The passenger at index " + index + " is " + passenger);
        }

        String passengerName = "Rahul";
        int i = airAsia.getIndexByPassengerName(passengerName);
        System.out.println("The passenger " + passengerName + " is at index " + i);
    }
}