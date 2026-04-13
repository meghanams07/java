class YouTubeRunner{
	public static void main(String[] args){
		
		YouTube youtube = new YouTube();

		Video v1 = new Video();
		v1.setVideoId(1); v1.setTitle("Video1"); v1.setChannelName("Channel1");
		youtube.addVideo(v1);

		Video v2 = new Video();
		v2.setVideoId(2); v2.setTitle("Video2"); v2.setChannelName("Channel2");
		youtube.addVideo(v2);

		Video v3 = new Video();
		v3.setVideoId(3); v3.setTitle("Video3"); v3.setChannelName("Channel3");
		youtube.addVideo(v3);

		Video v4 = new Video();
		v4.setVideoId(4); v4.setTitle("Video4"); v4.setChannelName("Channel4");
		youtube.addVideo(v4);

		Video v5 = new Video();
		v5.setVideoId(5); v5.setTitle("Video5"); v5.setChannelName("Channel5");
		youtube.addVideo(v5);

		Video v6 = new Video();
		v6.setVideoId(6); v6.setTitle("Video6"); v6.setChannelName("Channel6");
		youtube.addVideo(v6);

		Video v7 = new Video();
		v7.setVideoId(7); v7.setTitle("Video7"); v7.setChannelName("Channel7");
		youtube.addVideo(v7);

		Video v8 = new Video();
		v8.setVideoId(8); v8.setTitle("Video8"); v8.setChannelName("Channel8");
		youtube.addVideo(v8);

		Video v9 = new Video();
		v9.setVideoId(9); v9.setTitle("Video9"); v9.setChannelName("Channel9");
		youtube.addVideo(v9);

		Video v10 = new Video();
		v10.setVideoId(10); v10.setTitle("Video10"); v10.setChannelName("Channel10");
		youtube.addVideo(v10);

		Video v11 = new Video();
		v11.setVideoId(11); v11.setTitle("Video11"); v11.setChannelName("Channel11");
		youtube.addVideo(v11);

		Video v12 = new Video();
		v12.setVideoId(12); v12.setTitle("Video12"); v12.setChannelName("Channel12");
		youtube.addVideo(v12);

		Video v13 = new Video();
		v13.setVideoId(13); v13.setTitle("Video13"); v13.setChannelName("Channel13");
		youtube.addVideo(v13);

		Video v14 = new Video();
		v14.setVideoId(14); v14.setTitle("Video14"); v14.setChannelName("Channel14");
		youtube.addVideo(v14);

		Video v15 = new Video();
		v15.setVideoId(15); v15.setTitle("Video15"); v15.setChannelName("Channel15");
		youtube.addVideo(v15);

		Video v16 = new Video();
		v16.setVideoId(16); v16.setTitle("Video16"); v16.setChannelName("Channel16");
		youtube.addVideo(v16);

		Video v17 = new Video();
		v17.setVideoId(17); v17.setTitle("Video17"); v17.setChannelName("Channel17");
		youtube.addVideo(v17);

		Video v18 = new Video();
		v18.setVideoId(18); v18.setTitle("Video18"); v18.setChannelName("Channel18");
		youtube.addVideo(v18);

		Video v19 = new Video();
		v19.setVideoId(19); v19.setTitle("Video19"); v19.setChannelName("Channel19");
		youtube.addVideo(v19);

		youtube.getDetails();
	}
}