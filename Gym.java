class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment){
        boolean isValid = false;
        if(equipment != null && !equipment.isEmpty()){
            if(index < equipments.length){
                equipments[index] = equipment;
                index++;
                isValid = true;
            } else {
                System.out.println("Equipment list is full");
            }
        } else {
            System.out.println(equipment + " Not Valid");
        }
        return isValid;
    }

    public void displayEquipment(){
        System.out.println("\n--- Gym Equipments ---");
        for(String equipment : equipments){
            if(equipment != null){
                System.out.println(equipment);
            }
        }
    }

    public String getString(int index){
        String equipment = null;
        if(index < equipments.length){
            equipment = equipments[index];
            System.out.println(equipment);
            index++;
        } else System.out.println("Invalid");
        return equipment;
    }

    public int getIndex(String equipment){
        int index = 0;
        for(String e : equipments){
            if(e == equipment){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateEquipment(String existingEquipment, String updatedEquipment){
        boolean isUpdated = false;
        for(int index = 0; index < equipments.length; index++){
            if(equipments[index] == existingEquipment){
                equipments[index] = updatedEquipment;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Equipment Not Found");
        }
        return isUpdated;
    }

    public boolean deleteEquipment(String equipment){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < equipments.length; index++){
            if(equipments[index].equals(equipment)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < equipments.length - 1; j++){
                equipments[j] = equipments[j + 1];
            }
            equipments[equipments.length - 1] = null;
        }
        return isFound;
    }
}