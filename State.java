class State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highway){
        boolean isValid = false;
        if(highway != null && !highway.isEmpty()){
            if(index < highwayNames.length){
                highwayNames[index] = highway;
                index++;
                isValid = true;
            } else {
                System.out.println("Highway list is full");
            }
        } else {
            System.out.println(highway + " Not Valid");
        }
        return isValid;
    }

    public void displayHighways(){
        System.out.println("\n--- State Highways ---");
        for(String highway : highwayNames){
            if(highway != null){
                System.out.println(highway);
            }
        }
    }

    public String getString(int index){
        String highway = null;
        if(index < highwayNames.length){
            highway = highwayNames[index];
            System.out.println(highway);
            index++;
        } else System.out.println("Invalid");
        return highway;
    }

    public int getIndex(String highway){
        int index = 0;
        for(String h : highwayNames){
            if(h == highway){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateHighway(String existingHighway, String updatedHighway){
        boolean isUpdated = false;
        for(int index = 0; index < highwayNames.length; index++){
            if(highwayNames[index] == existingHighway){
                highwayNames[index] = updatedHighway;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Highway Not Found");
        }
        return isUpdated;
    }

    public boolean deleteHighway(String highway){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < highwayNames.length; index++){
            if(highwayNames[index].equals(highway)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < highwayNames.length - 1; j++){
                highwayNames[j] = highwayNames[j + 1];
            }
            highwayNames[highwayNames.length - 1] = null;
        }
        return isFound;
    }
}