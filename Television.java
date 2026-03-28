class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channel){
        boolean isValid = false;
        if(channel != null && !channel.isEmpty()){
            if(index < channelNames.length){
                channelNames[index] = channel;
                index++;
                isValid = true;
            } else {
                System.out.println("Channel list is full");
            }
        } else {
            System.out.println(channel + " Not Valid");
        }
        return isValid;
    }

    public void displayChannels(){
        System.out.println("\n--- Television Channels ---");
        for(String channel : channelNames){
            if(channel != null){
                System.out.println(channel);
            }
        }
    }

    public String getString(int index){
        String channel = null;
        if(index < channelNames.length){
            channel = channelNames[index];
            System.out.println(channel);
            index++;
        } else System.out.println("Invalid");
        return channel;
    }

    public int getIndex(String channel){
        int index = 0;
        for(String c : channelNames){
            if(c == channel){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateChannel(String existingChannel, String updatedChannel){
        boolean isUpdated = false;
        for(int index = 0; index < channelNames.length; index++){
            if(channelNames[index] == existingChannel){
                channelNames[index] = updatedChannel;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Channel Not Found");
        }
        return isUpdated;
    }

    public boolean deleteChannel(String channel){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < channelNames.length; index++){
            if(channelNames[index].equals(channel)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < channelNames.length - 1; j++){
                channelNames[j] = channelNames[j + 1];
            }
            channelNames[channelNames.length - 1] = null;
        }
        return isFound;
    }
}