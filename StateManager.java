class StateManager {
    private String[] highwayNames = new String[9];
    int index = 0;

    public boolean addHighway(String highwayName) {
        boolean isAdded = false;

        if (highwayName != null && !highwayName.isEmpty()) {
            if (index < highwayNames.length) {
                highwayNames[index] = highwayName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Highway list is full");
            }
        } else {
            System.out.println("Invalid highway name");
        }

        return isAdded;
    }

    public void getHighways() {
        for (String highway : highwayNames) {
            if (highway != null) {
                System.out.println(highway);
            }
        }
    }
}

