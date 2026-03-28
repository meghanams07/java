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
        universe.addGalaxy("Sunflower Galaxy");
        universe.addGalaxy("Cigar Galaxy");
        universe.addGalaxy("Tadpole Galaxy");
        universe.addGalaxy("Hoag's Object");
        universe.addGalaxy("Large Magellanic Cloud");
        universe.addGalaxy("Small Magellanic Cloud");
        universe.addGalaxy("Centaurus A");
        universe.addGalaxy("Messier 81");
        universe.addGalaxy("Messier 87");

        universe.displayGalaxies();

        System.out.println("\nGet Galaxy by Index:");
        universe.getString(5);

        System.out.println("\nGet Index by Name:");
        universe.getIndex("Andromeda");

        System.out.println("\nUpdate Galaxy:");
        universe.updateGalaxy("Milky Way", "Milky Way Galaxy");
        universe.displayGalaxies();

        System.out.println("\nDelete Galaxy:");
        universe.deleteGalaxy("Triangulum");
        universe.displayGalaxies();
    }
}