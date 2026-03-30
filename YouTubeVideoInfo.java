class YouTubeVideoInfo {

    private int videoId;
    private String title;
    private String channelName;
    private String duration;
    private String views;
    private String likes;
    private String uploadDate;
    private String category;
    private String quality;

    public void setVideoId(int videoId){
        this.videoId = videoId;
    }

    public int getVideoId(){
        return this.videoId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setChannelName(String channelName){
        this.channelName = channelName;
    }

    public String getChannelName(){
        return this.channelName;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public String getDuration(){
        return this.duration;
    }

    public void setViews(String views){
        this.views = views;
    }

    public String getViews(){
        return this.views;
    }

    public void setLikes(String likes){
        this.likes = likes;
    }

    public String getLikes(){
        return this.likes;
    }

    public void setUploadDate(String uploadDate){
        this.uploadDate = uploadDate;
    }

    public String getUploadDate(){
        return this.uploadDate;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

    public void setQuality(String quality){
        this.quality = quality;
    }

    public String getQuality(){
        return this.quality;
    }
}