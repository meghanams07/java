class SimBill{
	
	double billAmount;
	String billInvoiceNo;
	int billId;
	String issueDate;
	String dueDate;
	boolean isBillOverDue;
	boolean isLatestBill;
	boolean isFinalBill;
	
   public static void getDetails(){
	   System.out.println("Method is invoked");
   }
   
   SimBill(){
	   System.out.println("Constructor is invoked");
	   
 }
}