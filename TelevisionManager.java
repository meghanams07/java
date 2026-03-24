class TelevisionManager {
    private String[] channelNames = new String[17];
    int index = 0;

    public boolean addChannel(String channelName) {
        boolean isAdded = false;

        if (channelName != null && !channelName.isEmpty()) {
            if (index < channelNames.length) {
                channelNames[index] = channelName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Channel list is full");
            }
        } else {
            System.out.println("Invalid channel name");
        }

        return isAdded;
    }

    public void getChannels() {
        for (String channel : channelNames) {
            if (channel != null) {
                System.out.println(channel);
            }
        }
    }
}

