class ElectricityBillExecutor{
	public static void main(String[] args){
		
	 ElectricityBill firstBill = new ElectricityBill();
	 firstBill.billAmount = 599.99;
	 firstBill.billInvoiceNo = "A123";
	 firstBill.billId = 1;
	 firstBill.issueDate = "01-03-2026";
	 firstBill.dueDate = "06-03-2026";
	 firstBill.isBillOverDue = false;
	 firstBill.isLatestBill = true;
	 firstBill.isFinalBill = true;
	 
	 System.out.println("billAmount is :"+firstBill.billAmount);
	 System.out.println("billInvoiceNo is :"+firstBill.billInvoiceNo);
	 System.out.println("billId is :"+firstBill.billId);
	 System.out.println("issueDate is :"+firstBill.issueDate);
	 System.out.println("dueDate is :"+firstBill.dueDate);
	 System.out.println("isBillOverDue :"+firstBill.isBillOverDue);
	 System.out.println("isLatestBill  :"+firstBill.isLatestBill);
	 System.out.println("isFinalBill :"+firstBill.isFinalBill);
	 
	 
	 
	}
}