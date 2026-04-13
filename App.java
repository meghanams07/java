class App{
	Notification notifications[] = new Notification[5];
	int index;
	
	public boolean addNotification(Notification notification){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isTitleValid = false;
		boolean isMsgValid = false;
		
		int id = notification.getNotificationId();
		if(id > 0){
			isIdValid = true;
		}
		
		String title = notification.getTitle();
		if(title != null && !title.isEmpty()){
			isTitleValid = true;
		}
		
		String msg = notification.getMessage();
		if(msg != null && !msg.isEmpty()){
			isMsgValid = true;
		}
		
		if(isIdValid && isTitleValid && isMsgValid){
			if(index < notifications.length){
				this.notifications[index++] = notification;
				isAdded = true;
			}else{
				System.out.println("App Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Notification n : notifications){
			if(n != null){
				System.out.println(n.getNotificationId()+" "+n.getTitle()+" "+n.getMessage());
			}
		}
	}
}