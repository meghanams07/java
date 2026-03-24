class CricBuzManager {
    private String[] teamNames = new String[8];
    int index = 0;

    public boolean addTeam(String teamName) {
        boolean isAdded = false;

        if (teamName != null && !teamName.isEmpty()) {
            if (index < teamNames.length) {
                teamNames[index] = teamName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Team list is full");
            }
        } else {
            System.out.println("Invalid team name");
        }

        return isAdded;
    }

    public void getTeams() {
        for (String team : teamNames) {
            if (team != null) {
                System.out.println(team);
            }
        }
    }
}

