class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beach) {
        boolean isAdded = false;

        if (beach != null && !beach.isEmpty()) {
            if (index < beachNames.length) {
                beachNames[index++] = beach;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(beach + " is invalid beach");
        }
        return isAdded;
    }

    public void getBeaches() {
        for (String b : beachNames) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    public String getBeachByIndex(int index) {
        if (index < beachNames.length && beachNames[index] != null) {
            return beachNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByBeachName(String beachName) {
        for (int i = 0; i < beachNames.length; i++) {
            if (beachNames[i] != null && beachNames[i].equals(beachName)) {
                return i;
            }
        }
        System.out.println("invalid beach " + beachName);
        return -1;
    }
}