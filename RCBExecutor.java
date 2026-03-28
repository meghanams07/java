class RCBExecutor {
    public static void main(String[] args) {
        RCB rcb = new RCB();

        rcb.addPlayer("Virat Kohli");
        rcb.addPlayer("Faf du Plessis");
        rcb.addPlayer("Glenn Maxwell");
        rcb.addPlayer("Rajat Patidar");
        rcb.addPlayer("Dinesh Karthik");
        rcb.addPlayer("Mahipal Lomror");
        rcb.addPlayer("Anuj Rawat");
        rcb.addPlayer("Shahbaz Ahmed");
        rcb.addPlayer("Wanindu Hasaranga");
        rcb.addPlayer("Harshal Patel");
        rcb.addPlayer("Mohammed Siraj");
        rcb.addPlayer("Josh Hazlewood");
        rcb.addPlayer("Reece Topley");
        rcb.addPlayer("Karn Sharma");
        rcb.addPlayer("Suyash Prabhudessai");

        rcb.displayPlayers();

        System.out.println("\nGet Player by Index:");
        rcb.getString(2);

        System.out.println("\nGet Index by Name:");
        rcb.getIndex("Virat Kohli");

        System.out.println("\nUpdate Player:");
        rcb.updatePlayer("Dinesh Karthik", "DK Finisher");
        rcb.displayPlayers();

        System.out.println("\nDelete Player:");
        rcb.deletePlayer("Mahipal Lomror");
        rcb.displayPlayers();
    }
}