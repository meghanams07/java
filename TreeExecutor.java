class TreeExecutor {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addTree("Neem");
        tree.addTree("Banyan");
        tree.addTree("Peepal");
        tree.addTree("Mango");
        tree.addTree("Coconut");
        tree.addTree("Teak");
        tree.addTree("Sandalwood");
        tree.addTree("Eucalyptus");
        tree.addTree("Pine");
        tree.addTree("Oak");

        tree.displayTrees();

        System.out.println("\nGet Tree by Index:");
        tree.getString(3);

        System.out.println("\nGet Index by Name:");
        tree.getIndex("Mango");

        System.out.println("\nUpdate Tree:");
        tree.updateTree("Neem", "Neem Tree");
        tree.displayTrees();

        System.out.println("\nDelete Tree:");
        tree.deleteTree("Pine");
        tree.displayTrees();
    }
}