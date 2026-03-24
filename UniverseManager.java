class UniverseManager {
    private String[] galaxies = new String[17];
    int index = 0;

    public boolean addGalaxy(String galaxyName) {
        boolean isAdded = false;

        if (galaxyName != null && !galaxyName.isEmpty()) {
            if (index < galaxies.length) {
                galaxies[index] = galaxyName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Galaxy list is full");
            }
        } else {
            System.out.println("Invalid galaxy name");
        }

        return isAdded;
    }

    public void getGalaxies() {
        for (String galaxy : galaxies) {
            if (galaxy != null) {
                System.out.println(galaxy);
            }
        }
    }
}

