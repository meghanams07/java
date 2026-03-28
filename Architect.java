class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesign(String design) {
        boolean isAdded = false;

        if (design != null && !design.isEmpty()) {
            if (index < interiorDesignNames.length) {
                interiorDesignNames[index++] = design;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(design + " is invalid design");
        }
        return isAdded;
    }

    public void getInteriorDesigns() {
        for (String d : interiorDesignNames) {
            if (d != null) {
                System.out.println(d);
            }
        }
    }

    public String getInteriorDesignByIndex(int index) {
        if (index < interiorDesignNames.length && interiorDesignNames[index] != null) {
            return interiorDesignNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByInteriorDesignName(String designName) {
        for (int i = 0; i < interiorDesignNames.length; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(designName)) {
                return i;
            }
        }
        System.out.println("invalid design " + designName);
        return -1;
    }
}