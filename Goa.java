class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beach){
        boolean isValid = false;
        if(beach != null && !beach.isEmpty()){
            if(index < beachNames.length){
                beachNames[index] = beach;
                index++;
                isValid = true;
            } else {
                System.out.println("Beach list is full");
            }
        } else {
            System.out.println(beach + " Not Valid");
        }
        return isValid;
    }

    public void displayBeaches(){
        System.out.println("\n--- Goa Beaches ---");
        for(String beach : beachNames){
            if(beach != null){
                System.out.println(beach);
            }
        }
    }

    public String getString(int index){
        String beach = null;
        if(index < beachNames.length){
            beach = beachNames[index];
            System.out.println(beach);
            index++;
        } else System.out.println("Invalid");
        return beach;
    }

    public int getIndex(String beach){
        int index = 0;
        for(String b : beachNames){
            if(b == beach){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateBeach(String existingBeach, String updatedBeach){
        boolean isUpdated = false;
        for(int index = 0; index < beachNames.length; index++){
            if(beachNames[index] == existingBeach){
                beachNames[index] = updatedBeach;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Beach Not Found");
        }
        return isUpdated;
    }

    public boolean deleteBeach(String beach){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < beachNames.length; index++){
            if(beachNames[index].equals(beach)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < beachNames.length - 1; j++){
                beachNames[j] = beachNames[j + 1];
            }
            beachNames[beachNames.length - 1] = null;
        }
        return isFound;
    }
}