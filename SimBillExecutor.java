class SimBillExecutor{
	public static void main(String[] args){
		
	 /*SimBill firstBill = new SimBill();
	 firstBill.billAmount = 599.99;
	 firstBill.billInvoiceNo = "A123";
	 firstBill.billId = 1;
	 firstBill.issueDate = "01-03-2026";
	 firstBill.dueDate = "06-03-2026";
	 firstBill.isBillOverDue = false;
	 firstBill.isLatestBill = true;
	 firstBill.isFinalBill = true;*/
	 
	 SimBill secondBill  = new SimBill();
	 secondBill.billAmount = 599.99;
     double amount = secondBill.billAmount;	 
	 secondBill.billInvoiceNo = "A123";
	 String invoiceNo = secondBill.billInvoiceNo;
	 secondBill.billId = 1;
	 int id = secondBill.billId;
	 secondBill.issueDate = "01-03-2026";
	 String iDate = secondBill.issueDate;
	 secondBill.dueDate = "06-03-2026";
	 String dDate = secondBill.dueDate;
	 secondBill.isBillOverDue = false;
	 boolean overDue = secondBill.isBillOverDue;
	 secondBill.isLatestBill = true;
	 boolean latestBill = secondBill.isLatestBill;
	 secondBill.isFinalBill = true;
	 boolean finalBill = secondBill.isFinalBill;
	
	/* System.out.println("billAmount is :"+firstBill.billAmount);
	 System.out.println("billInvoiceNo is :"+firstBill.billInvoiceNo);
	 System.out.println("billId is :"+firstBill.billId);
	 System.out.println("issueDate is :"+firstBill.issueDate);
	 System.out.println("dueDate is :"+firstBill.dueDate);
	 System.out.println("isBillOverDue :"+firstBill.isBillOverDue);
	 System.out.println("isLatestBill  :"+firstBill.isLatestBill);
	 System.out.println("isFinalBill :"+firstBill.isFinalBill);
	 */
	 System.out.println("billAmount is :"+amount);
	 System.out.println("billInvoiceNo is :"+invoiceNo);
	 System.out.println("billId is :"+id);
	 System.out.println("issueDate is :"+iDate);
	 System.out.println("dueDate is :"+dDate);
	 System.out.println("isBillOverDue :"+overDue);
	 System.out.println("isLatestBill  :"+latestBill);
	 System.out.println("isFinalBill :"+finalBill);
	 
	 
	}
}
//bill.billId = 1;
//int billId = bill.billId;