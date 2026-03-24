class MuseumManager {
    private String[] historicalMonuments = new String[16];
    int index = 0;

    public boolean addMonument(String monumentName) {
        boolean isAdded = false;

        if (monumentName != null && !monumentName.isEmpty()) {
            if (index < historicalMonuments.length) {
                historicalMonuments[index] = monumentName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Monument list is full");
            }
        } else {
            System.out.println("Invalid monument name");
        }

        return isAdded;
    }

    public void getMonuments() {
        for (String monument : historicalMonuments) {
            if (monument != null) {
                System.out.println(monument);
            }
        }
    }
}

