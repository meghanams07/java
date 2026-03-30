class ApplicationExecutor{
	public static void main(String[] args){
		Application app = new Application();
		
		app.setAppId(1);
		app.setAppName("WhatsApp");
		app.setVersion("v1 026");
		app.setRequiredOs("Andriod");
		app.setReleasedOn("2014");
		app.setUpdatedOn("March 20");
		app.setPurchase("");
		app.setOfferedBy("");
		app.setDownloads("");
		
		int aId = app.getAppId();
		System.out.println(aId);
		
		String aName = app.getAppName();
		System.out.println(aName);
		
		String aVersion = app.getVersion();
		System.out.println(aVersion);
		
		String aReuiredOs = app.getRequiredOs();
		System.out.println(aReuiredOs);
		
		String aReleasedOn = app.getReleasedOn();
		System.out.println(aReleasedOn);
		
		String aUpdatedOn = app.getUpdatedOn();
		System.out.println(aUpdatedOn);
		
		String apurchase = app.getPurchase();
		System.out.println(apurchase);
		
		String aOfferedBy = app.getOfferedBy();
		System.out.println(aOfferedBy);
		
		String aDownloads = app.getDownloads();
		System.out.println(aDownloads);
		
	}
}
		