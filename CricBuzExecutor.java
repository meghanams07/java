class CricBuzExecutor {
    public static void main(String[] args) {
        CricBuz cric = new CricBuz();

        cric.addTeam("India");
        cric.addTeam("Australia");
        cric.addTeam("England");
        cric.addTeam("South Africa");
        cric.addTeam("New Zealand");
        cric.addTeam("Pakistan");
        cric.addTeam("Sri Lanka");
        cric.addTeam("West Indies");

        cric.displayTeams();

        System.out.println("\nGet Team by Index:");
        cric.getString(2);

        System.out.println("\nGet Index by Name:");
        cric.getIndex("India");

        System.out.println("\nUpdate Team:");
        cric.updateTeam("Pakistan", "Pakistan XI");
        cric.displayTeams();

        System.out.println("\nDelete Team:");
        cric.deleteTeam("Sri Lanka");
        cric.displayTeams();
    }
}