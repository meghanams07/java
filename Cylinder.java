class Cylinder {
    private String cylinders[] = new String[10];
    int index;

    public boolean addCylinder(String cylinder){
        boolean isValid = false;
        if(cylinder != null && !cylinder.isEmpty()){
            if(index < cylinders.length){
                cylinders[index] = cylinder;
                index++;
                isValid = true;
            } else {
                System.out.println("Cylinder list is full");
            }
        } else {
            System.out.println(cylinder + " Not Valid");
        }
        return isValid;
    }

    public void displayCylinders(){
        System.out.println("\n--- Cylinders ---");
        for(String cylinder : cylinders){
            if(cylinder != null){
                System.out.println(cylinder);
            }
        }
    }

    public String getString(int index){
        String cylinder = null;
        if(index < cylinders.length){
            cylinder = cylinders[index];
            System.out.println(cylinder);
            index++;
        } else System.out.println("Invalid");
        return cylinder;
    }

    public int getIndex(String cylinder){
        int index = 0;
        for(String c : cylinders){
            if(c == cylinder){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateCylinder(String existingCylinder, String updatedCylinder){
        boolean isUpdated = false;
        for(int index = 0; index < cylinders.length; index++){
            if(cylinders[index] == existingCylinder){
                cylinders[index] = updatedCylinder;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Cylinder Not Found");
        }
        return isUpdated;
    }

    public boolean deleteCylinder(String cylinder){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < cylinders.length; index++){
            if(cylinders[index].equals(cylinder)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < cylinders.length - 1; j++){
                cylinders[j] = cylinders[j + 1];
            }
            cylinders[cylinders.length - 1] = null;
        }
        return isFound;
    }
}