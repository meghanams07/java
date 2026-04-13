class Video{
	private int videoId;
	private String title;
	private String channelName;
	
	public void setVideoId(int videoId){
		this.videoId = videoId;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setChannelName(String channelName){
		this.channelName = channelName;
	}
	
	public int getVideoId(){
		return videoId;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getChannelName(){
		return channelName;
	}
}