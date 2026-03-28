class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channel) {
        boolean isAdded = false;

        if (channel != null && !channel.isEmpty()) {
            if (index < channelNames.length) {
                channelNames[index++] = channel;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(channel + " is invalid channel");
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

    public String getChannelByIndex(int index) {
        if (index < channelNames.length && channelNames[index] != null) {
            return channelNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByChannelName(String channelName) {
        for (int i = 0; i < channelNames.length; i++) {
            if (channelNames[i] != null && channelNames[i].equals(channelName)) {
                return i;
            }
        }
        System.out.println("invalid channel " + channelName);
        return -1;
    }
}