class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String team) {
        boolean isAdded = false;

        if (team != null && !team.isEmpty()) {
            if (index < teamNames.length) {
                teamNames[index++] = team;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(team + " is invalid team");
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

    public String getTeamByIndex(int index) {
        if (index < teamNames.length && teamNames[index] != null) {
            return teamNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByTeamName(String teamName) {
        for (int i = 0; i < teamNames.length; i++) {
            if (teamNames[i] != null && teamNames[i].equals(teamName)) {
                return i;
            }
        }
        System.out.println("invalid team " + teamName);
        return -1;
    }
}