class Instagram{
	Post posts[] = new Post[5];
	int index;
	
	public boolean addPost(Post post){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isCaptionValid = false;
		boolean isUserValid = false;
		
		int id = post.getPostId();
		if(id > 0){
			isIdValid = true;
		}
		
		String caption = post.getCaption();
		if(caption != null && !caption.isEmpty()){
			isCaptionValid = true;
		}
		
		String user = post.getUsername();
		if(user != null && !user.isEmpty()){
			isUserValid = true;
		}
		
		if(isIdValid && isCaptionValid && isUserValid){
			if(index < posts.length){
				this.posts[index++] = post;
				isAdded = true;
			}else{
				System.out.println("Instagram Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Post p : posts){
			if(p != null){
				System.out.println(p.getPostId()+" "+p.getCaption()+" "+p.getUsername());
			}
		}
	}
}