class Turbine {
    private String turbineTypes[] = new String[10];
    int index;

    public boolean addTurbine(String turbine){
        boolean isValid = false;
        if(turbine != null && !turbine.isEmpty()){
            if(index < turbineTypes.length){
                turbineTypes[index] = turbine;
                index++;
                isValid = true;
            } else {
                System.out.println("Turbine list is full");
            }
        } else {
            System.out.println(turbine + " Not Valid");
        }
        return isValid;
    }

    public void displayTurbines(){
        System.out.println("\n--- Turbines ---");
        for(String turbine : turbineTypes){
            if(turbine != null){
                System.out.println(turbine);
            }
        }
    }

    public String getString(int index){
        String turbine = null;
        if(index < turbineTypes.length){
            turbine = turbineTypes[index];
            System.out.println(turbine);
            index++;
        } else System.out.println("Invalid");
        return turbine;
    }

    public int getIndex(String turbine){
        int index = 0;
        for(String t : turbineTypes){
            if(t == turbine){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateTurbine(String existingTurbine, String updatedTurbine){
        boolean isUpdated = false;
        for(int index = 0; index < turbineTypes.length; index++){
            if(turbineTypes[index] == existingTurbine){
                turbineTypes[index] = updatedTurbine;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Turbine Not Found");
        }
        return isUpdated;
    }

    public boolean deleteTurbine(String turbine){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < turbineTypes.length; index++){
            if(turbineTypes[index].equals(turbine)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < turbineTypes.length - 1; j++){
                turbineTypes[j] = turbineTypes[j + 1];
            }
            turbineTypes[turbineTypes.length - 1] = null;
        }
        return isFound;
    }
}