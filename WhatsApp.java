class WhatsApp{
	Message messages[] = new Message[5];
	int index;
	
	public boolean addMessage(Message message){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isSenderValid = false;
		boolean isContentValid = false;
		
		int id = message.getMessageId();
		if(id > 0){
			isIdValid = true;
		}
		
		String sender = message.getSender();
		if(sender != null && !sender.isEmpty()){
			isSenderValid = true;
		}
		
		String content = message.getContent();
		if(content != null && !content.isEmpty()){
			isContentValid = true;
		}
		
		if(isIdValid && isSenderValid && isContentValid){
			if(index < messages.length){
				this.messages[index++] = message;
				isAdded = true;
			}else{
				System.out.println("WhatsApp Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Message m : messages){
			if(m != null){
				System.out.println(m.getMessageId()+" "+m.getSender()+" "+m.getContent());
			}
		}
	}
}