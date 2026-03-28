class GoaExecutor {
    public static void main(String[] args) {
        Goa goa = new Goa();

        goa.addBeach("Baga Beach");
        goa.addBeach("Calangute Beach");
        goa.addBeach("Anjuna Beach");
        goa.addBeach("Vagator Beach");
        goa.addBeach("Colva Beach");
        goa.addBeach("Palolem Beach");
        goa.addBeach("Candolim Beach");
        goa.addBeach("Morjim Beach");
        goa.addBeach("Arambol Beach");
        goa.addBeach("Miramar Beach");
        goa.addBeach("Dona Paula Beach");
        goa.addBeach("Agonda Beach");
        goa.addBeach("Sinquerim Beach");
        goa.addBeach("Mandrem Beach");
        goa.addBeach("Ashwem Beach");
        goa.addBeach("Butterfly Beach");
        goa.addBeach("Betalbatim Beach");
        goa.addBeach("Majorda Beach");
        goa.addBeach("Cavelossim Beach");

        goa.displayBeaches();

        System.out.println("\nGet Beach by Index:");
        goa.getString(5);

        System.out.println("\nGet Index by Name:");
        goa.getIndex("Anjuna Beach");

        System.out.println("\nUpdate Beach:");
        goa.updateBeach("Baga Beach", "Baga Beach North");
        goa.displayBeaches();

        System.out.println("\nDelete Beach:");
        goa.deleteBeach("Colva Beach");
        goa.displayBeaches();
    }
}