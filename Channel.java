class Channel {
    int channelId;
    String channelName;
    String language;
    String category;
    String country;
    int launchYear;
    String owner;
    String headquarters;
    String hdSupport;
    int frequency;
    String broadcastType;
    String resolution;
    String color;
    String famousShow;
    String timing;
    int viewers;
    String website;
    String contact;
    String status;
    String platform;

    public Channel(int channelId, String channelName, String language, String category,
                   String country, int launchYear, String owner, String headquarters,
                   String hdSupport, int frequency, String broadcastType, String resolution,
                   String color, String famousShow, String timing, int viewers,
                   String website, String contact, String status, String platform) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.language = language;
        this.category = category;
        this.country = country;
        this.launchYear = launchYear;
        this.owner = owner;
        this.headquarters = headquarters;
        this.hdSupport = hdSupport;
        this.frequency = frequency;
        this.broadcastType = broadcastType;
        this.resolution = resolution;
        this.color = color;
        this.famousShow = famousShow;
        this.timing = timing;
        this.viewers = viewers;
        this.website = website;
        this.contact = contact;
        this.status = status;
        this.platform = platform;
    }

    public void displayDetails() {
        System.out.println("=== Channel Details ===");
        System.out.println("ChannelId: " + channelId);
        System.out.println("ChannelName: " + channelName);
        System.out.println("Language: " + language);
        System.out.println("Category: " + category);
        System.out.println("Country: " + country);
        System.out.println("LaunchYear: " + launchYear);
        System.out.println("Owner: " + owner);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("HdSupport: " + hdSupport);
        System.out.println("Frequency: " + frequency);
        System.out.println("BroadcastType: " + broadcastType);
        System.out.println("Resolution: " + resolution);
        System.out.println("Color: " + color);
        System.out.println("FamousShow: " + famousShow);
        System.out.println("Timing: " + timing);
        System.out.println("Viewers: " + viewers);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Status: " + status);
        System.out.println("Platform: " + platform);
        System.out.println("======================");
    }
}
