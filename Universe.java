class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isAdded = false;

        if (galaxy != null && !galaxy.isEmpty()) {
            if (index < galaxies.length) {
                galaxies[index++] = galaxy;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(galaxy + " is invalid galaxy");
        }
        return isAdded;
    }

    public void getGalaxies() {
        for (String g : galaxies) {
            if (g != null) {
                System.out.println(g);
            }
        }
    }

    public String getGalaxyByIndex(int index) {
        if (index < galaxies.length && galaxies[index] != null) {
            return galaxies[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByGalaxyName(String galaxyName) {
        for (int i = 0; i < galaxies.length; i++) {
            if (galaxies[i] != null && galaxies[i].equals(galaxyName)) {
                return i;
            }
        }
        System.out.println("invalid galaxy " + galaxyName);
        return -1;
    }
}