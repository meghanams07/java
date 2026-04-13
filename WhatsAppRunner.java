class WhatsAppRunner{
	public static void main(String[] args){
		
		WhatsApp app = new WhatsApp();

		Message m1 = new Message();
		m1.setMessageId(1); m1.setSender("User1"); m1.setContent("Hello1");
		app.addMessage(m1);

		Message m2 = new Message();
		m2.setMessageId(2); m2.setSender("User2"); m2.setContent("Hello2");
		app.addMessage(m2);

		Message m3 = new Message();
		m3.setMessageId(3); m3.setSender("User3"); m3.setContent("Hello3");
		app.addMessage(m3);

		Message m4 = new Message();
		m4.setMessageId(4); m4.setSender("User4"); m4.setContent("Hello4");
		app.addMessage(m4);

		Message m5 = new Message();
		m5.setMessageId(5); m5.setSender("User5"); m5.setContent("Hello5");
		app.addMessage(m5);

		Message m6 = new Message();
		m6.setMessageId(6); m6.setSender("User6"); m6.setContent("Hello6");
		app.addMessage(m6);

		Message m7 = new Message();
		m7.setMessageId(7); m7.setSender("User7"); m7.setContent("Hello7");
		app.addMessage(m7);

		Message m8 = new Message();
		m8.setMessageId(8); m8.setSender("User8"); m8.setContent("Hello8");
		app.addMessage(m8);

		Message m9 = new Message();
		m9.setMessageId(9); m9.setSender("User9"); m9.setContent("Hello9");
		app.addMessage(m9);

		Message m10 = new Message();
		m10.setMessageId(10); m10.setSender("User10"); m10.setContent("Hello10");
		app.addMessage(m10);

		Message m11 = new Message();
		m11.setMessageId(11); m11.setSender("User11"); m11.setContent("Hello11");
		app.addMessage(m11);

		Message m12 = new Message();
		m12.setMessageId(12); m12.setSender("User12"); m12.setContent("Hello12");
		app.addMessage(m12);

		Message m13 = new Message();
		m13.setMessageId(13); m13.setSender("User13"); m13.setContent("Hello13");
		app.addMessage(m13);

		Message m14 = new Message();
		m14.setMessageId(14); m14.setSender("User14"); m14.setContent("Hello14");
		app.addMessage(m14);

		Message m15 = new Message();
		m15.setMessageId(15); m15.setSender("User15"); m15.setContent("Hello15");
		app.addMessage(m15);

		Message m16 = new Message();
		m16.setMessageId(16); m16.setSender("User16"); m16.setContent("Hello16");
		app.addMessage(m16);

		Message m17 = new Message();
		m17.setMessageId(17); m17.setSender("User17"); m17.setContent("Hello17");
		app.addMessage(m17);

		Message m18 = new Message();
		m18.setMessageId(18); m18.setSender("User18"); m18.setContent("Hello18");
		app.addMessage(m18);

		Message m19 = new Message();
		m19.setMessageId(19); m19.setSender("User19"); m19.setContent("Hello19");
		app.addMessage(m19);

		app.getDetails();
	}
}