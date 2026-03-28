class UniverseExecutor {
    public static void main(String[] args) {

        Universe universe = new Universe();

        universe.addGalaxy("Milky Way");
        universe.addGalaxy("Andromeda");
        universe.addGalaxy("Triangulum");
        universe.addGalaxy("Whirlpool Galaxy");
        universe.addGalaxy("Sombrero Galaxy");
        universe.addGalaxy("Pinwheel Galaxy");
        universe.addGalaxy("Cartwheel Galaxy");
        universe.addGalaxy("Black Eye Galaxy");
        universe.addGalaxy("Cigar Galaxy");
        universe.addGalaxy("Sunflower Galaxy");
        universe.addGalaxy("Large Magellanic Cloud");
        universe.addGalaxy("Small Magellanic Cloud");
        universe.addGalaxy("Centaurus A");
        universe.addGalaxy("Messier 87");
        universe.addGalaxy("NGC 1300");
        universe.addGalaxy("NGC 6744");
        universe.addGalaxy("NGC 4414");

        universe.getGalaxies();

        System.out.println();

        int index = 1;
        String galaxy = universe.getGalaxyByIndex(index);
        if (galaxy != null) {
            System.out.println("The galaxy at index " + index + " is " + galaxy);
        }

        String galaxyName = "Milky Way";
        int i = universe.getIndexByGalaxyName(galaxyName);
        System.out.println("The galaxy " + galaxyName + " is at index " + i);
    }
}