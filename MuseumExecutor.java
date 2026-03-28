class MuseumExecutor {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.addMonument("Taj Mahal");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Red Fort");
        museum.addMonument("India Gate");
        museum.addMonument("Hampi Ruins");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Charminar");
        museum.addMonument("Gateway of India");
        museum.addMonument("Sun Temple Konark");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Sanchi Stupa");
        museum.addMonument("Gol Gumbaz");
        museum.addMonument("Fatehpur Sikri");
        museum.addMonument("Victoria Memorial");
        museum.addMonument("Meenakshi Temple");

        museum.displayMonuments();

        System.out.println("\nGet Monument by Index:");
        museum.getString(4);

        System.out.println("\nGet Index by Name:");
        museum.getIndex("Charminar");

        System.out.println("\nUpdate Monument:");
        museum.updateMonument("Red Fort", "Red Fort Delhi");
        museum.displayMonuments();

        System.out.println("\nDelete Monument:");
        museum.deleteMonument("India Gate");
        museum.displayMonuments();
    }
}