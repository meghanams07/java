class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monument){
        boolean isValid = false;
        if(monument != null && !monument.isEmpty()){
            if(index < historicalMonuments.length){
                historicalMonuments[index] = monument;
                index++;
                isValid = true;
            } else {
                System.out.println("Monument list is full");
            }
        } else {
            System.out.println(monument + " Not Valid");
        }
        return isValid;
    }

    public void displayMonuments(){
        System.out.println("\n--- Historical Monuments ---");
        for(String monument : historicalMonuments){
            if(monument != null){
                System.out.println(monument);
            }
        }
    }

    public String getString(int index){
        String monument = null;
        if(index < historicalMonuments.length){
            monument = historicalMonuments[index];
            System.out.println(monument);
            index++;
        } else System.out.println("Invalid");
        return monument;
    }

    public int getIndex(String monument){
        int index = 0;
        for(String m : historicalMonuments){
            if(m == monument){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateMonument(String existingMonument, String updatedMonument){
        boolean isUpdated = false;
        for(int index = 0; index < historicalMonuments.length; index++){
            if(historicalMonuments[index] == existingMonument){
                historicalMonuments[index] = updatedMonument;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Monument Not Found");
        }
        return isUpdated;
    }

    public boolean deleteMonument(String monument){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < historicalMonuments.length; index++){
            if(historicalMonuments[index].equals(monument)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < historicalMonuments.length - 1; j++){
                historicalMonuments[j] = historicalMonuments[j + 1];
            }
            historicalMonuments[historicalMonuments.length - 1] = null;
        }
        return isFound;
    }
}