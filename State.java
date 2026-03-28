class State {
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
}