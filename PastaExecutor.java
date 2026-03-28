class PastaExecutor {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

        pasta.addPasta("Spaghetti");
        pasta.addPasta("Penne");
        pasta.addPasta("Fusilli");
        pasta.addPasta("Macaroni");
        pasta.addPasta("Lasagna");
        pasta.addPasta("Ravioli");
        pasta.addPasta("Fettuccine");
        pasta.addPasta("Linguine");
        pasta.addPasta("Rigatoni");
        pasta.addPasta("Tagliatelle");

        pasta.displayPasta();

        System.out.println("\nGet Pasta by Index:");
        pasta.getString(2);

        System.out.println("\nGet Index by Name:");
        pasta.getIndex("Lasagna");

        System.out.println("\nUpdate Pasta:");
        pasta.updatePasta("Macaroni", "Cheese Macaroni");
        pasta.displayPasta();

        System.out.println("\nDelete Pasta:");
        pasta.deletePasta("Ravioli");
        pasta.displayPasta();
    }
}