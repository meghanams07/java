class Message{
	private int messageId;
	private String sender;
	private String content;
	
	public void setMessageId(int messageId){
		this.messageId = messageId;
	}
	
	public void setSender(String sender){
		this.sender = sender;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public int getMessageId(){
		return messageId;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getContent(){
		return content;
	}
}