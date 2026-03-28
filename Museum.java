class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monument) {
        boolean isAdded = false;

        if (monument != null && !monument.isEmpty()) {
            if (index < historicalMonuments.length) {
                historicalMonuments[index++] = monument;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(monument + " is invalid monument");
        }
        return isAdded;
    }

    public void getMonuments() {
        for (String m : historicalMonuments) {
            if (m != null) {
                System.out.println(m);
            }
        }
    }

    public String getMonumentByIndex(int index) {
        if (index < historicalMonuments.length && historicalMonuments[index] != null) {
            return historicalMonuments[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByMonumentName(String monumentName) {
        for (int i = 0; i < historicalMonuments.length; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(monumentName)) {
                return i;
            }
        }
        System.out.println("invalid monument " + monumentName);
        return -1;
    }
}