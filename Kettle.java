class Kettle {
    private String kettleTypes[] = new String[10];
    int index;

    public boolean addKettle(String kettle){
        boolean isValid = false;
        if(kettle != null && !kettle.isEmpty()){
            if(index < kettleTypes.length){
                kettleTypes[index] = kettle;
                index++;
                isValid = true;
            } else {
                System.out.println("Kettle list is full");
            }
        } else {
            System.out.println(kettle + " Not Valid");
        }
        return isValid;
    }

    public void displayKettles(){
        System.out.println("\n--- Kettles ---");
        for(String kettle : kettleTypes){
            if(kettle != null){
                System.out.println(kettle);
            }
        }
    }

    public String getString(int index){
        String kettle = null;
        if(index < kettleTypes.length){
            kettle = kettleTypes[index];
            System.out.println(kettle);
            index++;
        } else System.out.println("Invalid");
        return kettle;
    }

    public int getIndex(String kettle){
        int index = 0;
        for(String k : kettleTypes){
            if(k == kettle){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateKettle(String existingKettle, String updatedKettle){
        boolean isUpdated = false;
        for(int index = 0; index < kettleTypes.length; index++){
            if(kettleTypes[index] == existingKettle){
                kettleTypes[index] = updatedKettle;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Kettle Not Found");
        }
        return isUpdated;
    }

    public boolean deleteKettle(String kettle){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < kettleTypes.length; index++){
            if(kettleTypes[index].equals(kettle)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < kettleTypes.length - 1; j++){
                kettleTypes[j] = kettleTypes[j + 1];
            }
            kettleTypes[kettleTypes.length - 1] = null;
        }
        return isFound;
    }
}