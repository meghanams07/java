class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxy){
        boolean isValid = false;
        if(galaxy != null && !galaxy.isEmpty()){
            if(index < galaxies.length){
                galaxies[index] = galaxy;
                index++;
                isValid = true;
            } else {
                System.out.println("Galaxy list is full");
            }
        } else {
            System.out.println(galaxy + " Not Valid");
        }
        return isValid;
    }

    public void displayGalaxies(){
        System.out.println("\n--- Galaxies ---");
        for(String galaxy : galaxies){
            if(galaxy != null){
                System.out.println(galaxy);
            }
        }
    }

    public String getString(int index){
        String galaxy = null;
        if(index < galaxies.length){
            galaxy = galaxies[index];
            System.out.println(galaxy);
            index++;
        } else System.out.println("Invalid");
        return galaxy;
    }

    public int getIndex(String galaxy){
        int index = 0;
        for(String g : galaxies){
            if(g == galaxy){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateGalaxy(String existingGalaxy, String updatedGalaxy){
        boolean isUpdated = false;
        for(int index = 0; index < galaxies.length; index++){
            if(galaxies[index] == existingGalaxy){
                galaxies[index] = updatedGalaxy;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Galaxy Not Found");
        }
        return isUpdated;
    }

    public boolean deleteGalaxy(String galaxy){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < galaxies.length; index++){
            if(galaxies[index].equals(galaxy)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < galaxies.length - 1; j++){
                galaxies[j] = galaxies[j + 1];
            }
            galaxies[galaxies.length - 1] = null;
        }
        return isFound;
    }
}