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
        goa.addBeach("Majorda Beach");
        goa.addBeach("Betalbatim Beach");
        goa.addBeach("Sinquerim Beach");
        goa.addBeach("Benaulim Beach");
        goa.addBeach("Cavelossim Beach");
        goa.addBeach("Butterfly Beach");
        goa.addBeach("Ashwem Beach");

        goa.getBeaches();

        System.out.println();

        int index = 3;
        String beach = goa.getBeachByIndex(index);
        if (beach != null) {
            System.out.println("The beach at index " + index + " is " + beach);
        }

        String beachName = "Baga Beach";
        int i = goa.getIndexByBeachName(beachName);
        System.out.println("The beach " + beachName + " is at index " + i);
    }
}