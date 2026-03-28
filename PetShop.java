class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory){
        boolean isValid = false;
        if(accessory != null && !accessory.isEmpty()){
            if(index < petAccessories.length){
                petAccessories[index] = accessory;
                index++;
                isValid = true;
            } else {
                System.out.println("Accessory list is full");
            }
        } else {
            System.out.println(accessory + " Not Valid");
        }
        return isValid;
    }

    public void displayAccessories(){
        System.out.println("\n--- Pet Accessories ---");
        for(String accessory : petAccessories){
            if(accessory != null){
                System.out.println(accessory);
            }
        }
    }

    public String getString(int index){
        String accessory = null;
        if(index < petAccessories.length){
            accessory = petAccessories[index];
            System.out.println(accessory);
            index++;
        } else System.out.println("Invalid");
        return accessory;
    }

    public int getIndex(String accessory){
        int index = 0;
        for(String a : petAccessories){
            if(a == accessory){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateAccessory(String existingAccessory, String updatedAccessory){
        boolean isUpdated = false;
        for(int index = 0; index < petAccessories.length; index++){
            if(petAccessories[index] == existingAccessory){
                petAccessories[index] = updatedAccessory;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Accessory Not Found");
        }
        return isUpdated;
    }

    public boolean deleteAccessory(String accessory){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < petAccessories.length; index++){
            if(petAccessories[index].equals(accessory)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < petAccessories.length - 1; j++){
                petAccessories[j] = petAccessories[j + 1];
            }
            petAccessories[petAccessories.length - 1] = null;
        }
        return isFound;
    }
}