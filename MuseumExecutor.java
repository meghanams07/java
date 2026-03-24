class MuseumExecutor {
    public static void main(String[] args) {

        MuseumManager manager = new MuseumManager();

        manager.addMonument("Taj Mahal");
        manager.addMonument("Red Fort");
        manager.addMonument("Qutub Minar");
        manager.addMonument("Hampi Ruins");
        manager.addMonument("Mysore Palace");
        manager.addMonument("Gateway of India");
        manager.addMonument("Charminar");
        manager.addMonument("Konark Sun Temple");
        manager.addMonument("Ajanta Caves");
        manager.addMonument("Ellora Caves");
        manager.addMonument("India Gate");
        manager.addMonument("Gol Gumbaz");
        manager.addMonument("Meenakshi Temple");
        manager.addMonument("Victoria Memorial");
        manager.addMonument("Fatehpur Sikri");
        manager.addMonument("Sanchi Stupa");

        manager.getMonuments();
    }
}