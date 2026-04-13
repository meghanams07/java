class YouTube{
	Video videos[] = new Video[5];
	int index;
	
	public boolean addVideo(Video video){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isTitleValid = false;
		boolean isChannelValid = false;
		
		int id = video.getVideoId();
		if(id > 0){
			isIdValid = true;
		}
		
		String title = video.getTitle();
		if(title != null && !title.isEmpty()){
			isTitleValid = true;
		}
		
		String channel = video.getChannelName();
		if(channel != null && !channel.isEmpty()){
			isChannelValid = true;
		}
		
		if(isIdValid && isTitleValid && isChannelValid){
			if(index < videos.length){
				this.videos[index++] = video;
				isAdded = true;
			}else{
				System.out.println("YouTube Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Video v : videos){
			if(v != null){
				System.out.println(v.getVideoId()+" "+v.getTitle()+" "+v.getChannelName());
			}
		}
	}
}