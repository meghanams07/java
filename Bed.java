class Bed {
    private String bedTypes[] = new String[10];
    int index;

    public boolean addBed(String bed){
        boolean isValid = false;
        if(bed != null && !bed.isEmpty()){
            if(index < bedTypes.length){
                bedTypes[index] = bed;
                index++;
                isValid = true;
            } else {
                System.out.println("Bed list is full");
            }
        } else {
            System.out.println(bed + " Not Valid");
        }
        return isValid;
    }

    public void displayBeds(){
        System.out.println("\n--- Beds ---");
        for(String bed : bedTypes){
            if(bed != null){
                System.out.println(bed);
            }
        }
    }

    public String getString(int index){
        String bed = null;
        if(index < bedTypes.length){
            bed = bedTypes[index];
            System.out.println(bed);
            index++;
        } else System.out.println("Invalid");
        return bed;
    }

    public int getIndex(String bed){
        int index = 0;
        for(String b : bedTypes){
            if(b == bed){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateBed(String existingBed, String updatedBed){
        boolean isUpdated = false;
        for(int index = 0; index < bedTypes.length; index++){
            if(bedTypes[index] == existingBed){
                bedTypes[index] = updatedBed;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Bed Not Found");
        }
        return isUpdated;
    }

    public boolean deleteBed(String bed){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < bedTypes.length; index++){
            if(bedTypes[index].equals(bed)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < bedTypes.length - 1; j++){
                bedTypes[j] = bedTypes[j + 1];
            }
            bedTypes[bedTypes.length - 1] = null;
        }
        return isFound;
    }
}