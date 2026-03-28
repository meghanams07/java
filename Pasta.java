class Pasta {
    private String pastaNames[] = new String[10];
    int index;

    public boolean addPasta(String pasta){
        boolean isValid = false;
        if(pasta != null && !pasta.isEmpty()){
            if(index < pastaNames.length){
                pastaNames[index] = pasta;
                index++;
                isValid = true;
            } else {
                System.out.println("Pasta list is full");
            }
        } else {
            System.out.println(pasta + " Not Valid");
        }
        return isValid;
    }

    public void displayPasta(){
        System.out.println("\n--- Pasta Types ---");
        for(String pasta : pastaNames){
            if(pasta != null){
                System.out.println(pasta);
            }
        }
    }

    public String getString(int index){
        String pasta = null;
        if(index < pastaNames.length){
            pasta = pastaNames[index];
            System.out.println(pasta);
            index++;
        } else System.out.println("Invalid");
        return pasta;
    }

    public int getIndex(String pasta){
        int index = 0;
        for(String p : pastaNames){
            if(p == pasta){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updatePasta(String existingPasta, String updatedPasta){
        boolean isUpdated = false;
        for(int index = 0; index < pastaNames.length; index++){
            if(pastaNames[index] == existingPasta){
                pastaNames[index] = updatedPasta;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Pasta Not Found");
        }
        return isUpdated;
    }

    public boolean deletePasta(String pasta){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < pastaNames.length; index++){
            if(pastaNames[index].equals(pasta)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < pastaNames.length - 1; j++){
                pastaNames[j] = pastaNames[j + 1];
            }
            pastaNames[pastaNames.length - 1] = null;
        }
        return isFound;
    }
}