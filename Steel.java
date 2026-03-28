class Steel {
    private String steelTypes[] = new String[10];
    int index;

    public boolean addSteel(String steel){
        boolean isValid = false;
        if(steel != null && !steel.isEmpty()){
            if(index < steelTypes.length){
                steelTypes[index] = steel;
                index++;
                isValid = true;
            } else {
                System.out.println("Steel list is full");
            }
        } else {
            System.out.println(steel + " Not Valid");
        }
        return isValid;
    }

    public void displaySteel(){
        System.out.println("\n--- Steel Types ---");
        for(String steel : steelTypes){
            if(steel != null){
                System.out.println(steel);
            }
        }
    }

    public String getString(int index){
        String steel = null;
        if(index < steelTypes.length){
            steel = steelTypes[index];
            System.out.println(steel);
            index++;
        } else System.out.println("Invalid");
        return steel;
    }

    public int getIndex(String steel){
        int index = 0;
        for(String s : steelTypes){
            if(s == steel){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateSteel(String existingSteel, String updatedSteel){
        boolean isUpdated = false;
        for(int index = 0; index < steelTypes.length; index++){
            if(steelTypes[index] == existingSteel){
                steelTypes[index] = updatedSteel;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Steel Not Found");
        }
        return isUpdated;
    }

    public boolean deleteSteel(String steel){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < steelTypes.length; index++){
            if(steelTypes[index].equals(steel)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < steelTypes.length - 1; j++){
                steelTypes[j] = steelTypes[j + 1];
            }
            steelTypes[steelTypes.length - 1] = null;
        }
        return isFound;
    }
}