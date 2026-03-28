class Singer {
    private String singerNames[] = new String[10];
    int index;

    public boolean addSinger(String singer){
        boolean isValid = false;
        if(singer != null && !singer.isEmpty()){
            if(index < singerNames.length){
                singerNames[index] = singer;
                index++;
                isValid = true;
            } else {
                System.out.println("Singer list is full");
            }
        } else {
            System.out.println(singer + " Not Valid");
        }
        return isValid;
    }

    public void displaySingers(){
        System.out.println("\n--- Singers ---");
        for(String singer : singerNames){
            if(singer != null){
                System.out.println(singer);
            }
        }
    }

    public String getString(int index){
        String singer = null;
        if(index < singerNames.length){
            singer = singerNames[index];
            System.out.println(singer);
            index++;
        } else System.out.println("Invalid");
        return singer;
    }

    public int getIndex(String singer){
        int index = 0;
        for(String s : singerNames){
            if(s == singer){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateSinger(String existingSinger, String updatedSinger){
        boolean isUpdated = false;
        for(int index = 0; index < singerNames.length; index++){
            if(singerNames[index] == existingSinger){
                singerNames[index] = updatedSinger;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Singer Not Found");
        }
        return isUpdated;
    }

    public boolean deleteSinger(String singer){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < singerNames.length; index++){
            if(singerNames[index].equals(singer)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < singerNames.length - 1; j++){
                singerNames[j] = singerNames[j + 1];
            }
            singerNames[singerNames.length - 1] = null;
        }
        return isFound;
    }
}