class Notification{
	private int notificationId;
	private String title;
	private String message;
	
	public void setNotificationId(int notificationId){
		this.notificationId = notificationId;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public int getNotificationId(){
		return notificationId;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getMessage(){
		return message;
	}
}