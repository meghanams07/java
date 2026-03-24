class UniverseExecutor {
    public static void main(String[] args) {

        UniverseManager manager = new UniverseManager();

        manager.addGalaxy("Milky Way");
        manager.addGalaxy("Andromeda");
        manager.addGalaxy("Triangulum");
        manager.addGalaxy("Whirlpool Galaxy");
        manager.addGalaxy("Sombrero Galaxy");
        manager.addGalaxy("Pinwheel Galaxy");
        manager.addGalaxy("Cartwheel Galaxy");
        manager.addGalaxy("Black Eye Galaxy");
        manager.addGalaxy("Cigar Galaxy");
        manager.addGalaxy("Sunflower Galaxy");
        manager.addGalaxy("Centaurus A");
        manager.addGalaxy("Messier 87");
        manager.addGalaxy("NGC 1300");
        manager.addGalaxy("NGC 4993");
        manager.addGalaxy("NGC 6744");
        manager.addGalaxy("NGC 4889");
        manager.addGalaxy("NGC 5128");

        manager.getGalaxies();
    }
}