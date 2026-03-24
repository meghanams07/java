class CricBuzExecutor {
    public static void main(String[] args) {

        CricBuzManager manager = new CricBuzManager();

        manager.addTeam("India");
        manager.addTeam("Australia");
        manager.addTeam("England");
        manager.addTeam("Pakistan");
        manager.addTeam("South Africa");
        manager.addTeam("New Zealand");
        manager.addTeam("Sri Lanka");
        manager.addTeam("Bangladesh");

        manager.getTeams();
    }
}