class RCBExecutor {
    public static void main(String[] args) {

        RCBManager manager = new RCBManager();

        manager.addPlayer("Virat Kohli");
        manager.addPlayer("Faf du Plessis");
        manager.addPlayer("Glenn Maxwell");
        manager.addPlayer("Rajat Patidar");
        manager.addPlayer("Dinesh Karthik");
        manager.addPlayer("Anuj Rawat");
        manager.addPlayer("Mahipal Lomror");
        manager.addPlayer("Shahbaz Ahmed");
        manager.addPlayer("Wanindu Hasaranga");
        manager.addPlayer("Harshal Patel");
        manager.addPlayer("Mohammed Siraj");
        manager.addPlayer("Josh Hazlewood");
        manager.addPlayer("Reece Topley");
        manager.addPlayer("Karn Sharma");
        manager.addPlayer("Akash Deep");

        manager.getPlayers();
    }
}