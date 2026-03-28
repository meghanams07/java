class PhonePe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insurance){
        boolean isValid = false;
        if(insurance != null && !insurance.isEmpty()){
            if(index < insuranceNames.length){
                insuranceNames[index] = insurance;
                index++;
                isValid = true;
            } else {
                System.out.println("Insurance list is full");
            }
        } else {
            System.out.println(insurance + " Not Valid");
        }
        return isValid;
    }

    public void displayInsurance(){
        System.out.println("\n--- PhonePe Insurance ---");
        for(String insurance : insuranceNames){
            if(insurance != null){
                System.out.println(insurance);
            }
        }
    }

    public String getString(int index){
        String insurance = null;
        if(index < insuranceNames.length){
            insurance = insuranceNames[index];
            System.out.println(insurance);
            index++;
        } else System.out.println("Invalid");
        return insurance;
    }

    public int getIndex(String insurance){
        int index = 0;
        for(String i : insuranceNames){
            if(i == insurance){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateInsurance(String existingInsurance, String updatedInsurance){
        boolean isUpdated = false;
        for(int index = 0; index < insuranceNames.length; index++){
            if(insuranceNames[index] == existingInsurance){
                insuranceNames[index] = updatedInsurance;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Insurance Not Found");
        }
        return isUpdated;
    }

    public boolean deleteInsurance(String insurance){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < insuranceNames.length; index++){
            if(insuranceNames[index].equals(insurance)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < insuranceNames.length - 1; j++){
                insuranceNames[j] = insuranceNames[j + 1];
            }
            insuranceNames[insuranceNames.length - 1] = null;
        }
        return isFound;
    }
}