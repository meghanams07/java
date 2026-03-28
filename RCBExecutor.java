class RCBExecutor {
    public static void main(String[] args) {

        RCB rcb = new RCB();

        rcb.addPlayer("Virat Kohli");
        rcb.addPlayer("Faf du Plessis");
        rcb.addPlayer("Glenn Maxwell");
        rcb.addPlayer("Rajat Patidar");
        rcb.addPlayer("Dinesh Karthik");
        rcb.addPlayer("Anuj Rawat");
        rcb.addPlayer("Mahipal Lomror");
        rcb.addPlayer("Shahbaz Ahmed");
        rcb.addPlayer("Wanindu Hasaranga");
        rcb.addPlayer("Harshal Patel");
        rcb.addPlayer("Mohammed Siraj");
        rcb.addPlayer("Josh Hazlewood");
        rcb.addPlayer("Reece Topley");
        rcb.addPlayer("Karn Sharma");
        rcb.addPlayer("Suyash Prabhudessai");

        rcb.getPlayers();

        System.out.println();

        int index = 0;
        String player = rcb.getPlayerByIndex(index);
        if (player != null) {
            System.out.println("The player at index " + index + " is " + player);
        }

        String playerName = "Virat Kohli";
        int i = rcb.getIndexByPlayerName(playerName);
        System.out.println("The player " + playerName + " is at index " + i);
    }
}