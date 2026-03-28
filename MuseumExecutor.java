class MuseumExecutor {
    public static void main(String[] args) {

        Museum museum = new Museum();

        museum.addMonument("Taj Mahal");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Red Fort");
        museum.addMonument("India Gate");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Hampi Ruins");
        museum.addMonument("Charminar");
        museum.addMonument("Gateway of India");
        museum.addMonument("Golden Temple");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Konark Sun Temple");
        museum.addMonument("Meenakshi Temple");
        museum.addMonument("Sanchi Stupa");
        museum.addMonument("Victoria Memorial");
        museum.addMonument("Lotus Temple");

        museum.getMonuments();

        System.out.println();

        int index = 5;
        String monument = museum.getMonumentByIndex(index);
        if (monument != null) {
            System.out.println("The monument at index " + index + " is " + monument);
        }

        String monumentName = "Taj Mahal";
        int i = museum.getIndexByMonumentName(monumentName);
        System.out.println("The monument " + monumentName + " is at index " + i);
    }
}