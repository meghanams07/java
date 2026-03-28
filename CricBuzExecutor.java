class CricBuzExecutor {
    public static void main(String[] args) {

        CricBuz cric = new CricBuz();

        cric.addTeam("India");
        cric.addTeam("Australia");
        cric.addTeam("England");
        cric.addTeam("Pakistan");
        cric.addTeam("South Africa");
        cric.addTeam("New Zealand");
        cric.addTeam("Sri Lanka");
        cric.addTeam("Bangladesh");

        cric.getTeams();

        System.out.println();

        int index = 2;
        String team = cric.getTeamByIndex(index);
        if (team != null) {
            System.out.println("The team at index " + index + " is " + team);
        }

        String teamName = "India";
        int i = cric.getIndexByTeamName(teamName);
        System.out.println("The team " + teamName + " is at index " + i);
    }
}