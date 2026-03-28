class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String team){
        boolean isValid = false;
        if(team != null && !team.isEmpty()){
            if(index < teamNames.length){
                teamNames[index] = team;
                index++;
                isValid = true;
            } else {
                System.out.println("Team list is full");
            }
        } else {
            System.out.println(team + " Not Valid");
        }
        return isValid;
    }

    public void displayTeams(){
        System.out.println("\n--- CricBuz Teams ---");
        for(String team : teamNames){
            if(team != null){
                System.out.println(team);
            }
        }
    }

    public String getString(int index){
        String team = null;
        if(index < teamNames.length){
            team = teamNames[index];
            System.out.println(team);
            index++;
        } else System.out.println("Invalid");
        return team;
    }

    public int getIndex(String team){
        int index = 0;
        for(String t : teamNames){
            if(t == team){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateTeam(String existingTeam, String updatedTeam){
        boolean isUpdated = false;
        for(int index = 0; index < teamNames.length; index++){
            if(teamNames[index] == existingTeam){
                teamNames[index] = updatedTeam;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Team Not Found");
        }
        return isUpdated;
    }

    public boolean deleteTeam(String team){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < teamNames.length; index++){
            if(teamNames[index].equals(team)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < teamNames.length - 1; j++){
                teamNames[j] = teamNames[j + 1];
            }
            teamNames[teamNames.length - 1] = null;
        }
        return isFound;
    }
}