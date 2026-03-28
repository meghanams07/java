class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String design){
        boolean isValid = false;
        if(design != null && !design.isEmpty()){
            if(index < interiorDesignNames.length){
                interiorDesignNames[index] = design;
                index++;
                isValid = true;
            } else {
                System.out.println("Design list is full");
            }
        } else {
            System.out.println(design + " Not Valid");
        }
        return isValid;
    }

    public void displayDesigns(){
        System.out.println("\n--- Interior Designs ---");
        for(String design : interiorDesignNames){
            if(design != null){
                System.out.println(design);
            }
        }
    }

    public String getString(int index){
        String design = null;
        if(index < interiorDesignNames.length){
            design = interiorDesignNames[index];
            System.out.println(design);
            index++;
        } else System.out.println("Invalid");
        return design;
    }

    public int getIndex(String design){
        int index = 0;
        for(String d : interiorDesignNames){
            if(d == design){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateDesign(String existingDesign, String updatedDesign){
        boolean isUpdated = false;
        for(int index = 0; index < interiorDesignNames.length; index++){
            if(interiorDesignNames[index] == existingDesign){
                interiorDesignNames[index] = updatedDesign;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Design Not Found");
        }
        return isUpdated;
    }

    public boolean deleteDesign(String design){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < interiorDesignNames.length; index++){
            if(interiorDesignNames[index].equals(design)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < interiorDesignNames.length - 1; j++){
                interiorDesignNames[j] = interiorDesignNames[j + 1];
            }
            interiorDesignNames[interiorDesignNames.length - 1] = null;
        }
        return isFound;
    }
}