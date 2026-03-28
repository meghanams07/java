class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance){
        boolean isValid = false;
        if(appliance != null && !appliance.isEmpty()){
            if(index < appliances.length){
                appliances[index] = appliance;
                index++;
                isValid = true;
            } else {
                System.out.println("Appliance list is full");
            }
        } else {
            System.out.println(appliance + " Not Valid");
        }
        return isValid;
    }

    public void displayAppliances(){
        System.out.println("\n--- Electrical Appliances ---");
        for(String appliance : appliances){
            if(appliance != null){
                System.out.println(appliance);
            }
        }
    }

    public String getString(int index){
        String appliance = null;
        if(index < appliances.length){
            appliance = appliances[index];
            System.out.println(appliance);
            index++;
        } else System.out.println("Invalid");
        return appliance;
    }

    public int getIndex(String appliance){
        int index = 0;
        for(String a : appliances){
            if(a == appliance){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateAppliance(String existingAppliance, String updatedAppliance){
        boolean isUpdated = false;
        for(int index = 0; index < appliances.length; index++){
            if(appliances[index] == existingAppliance){
                appliances[index] = updatedAppliance;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Appliance Not Found");
        }
        return isUpdated;
    }

    public boolean deleteAppliance(String appliance){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < appliances.length; index++){
            if(appliances[index].equals(appliance)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < appliances.length - 1; j++){
                appliances[j] = appliances[j + 1];
            }
            appliances[appliances.length - 1] = null;
        }
        return isFound;
    }
}