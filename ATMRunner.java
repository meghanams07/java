class ATMRunner{
	public static void main(String[] args){
		
		ATM atm = new ATM();

		Transaction t1 = new Transaction();
		t1.setTransactionId(1); t1.setType("Deposit"); t1.setAmount(1000);
		atm.addTransaction(t1);

		Transaction t2 = new Transaction();
		t2.setTransactionId(2); t2.setType("Withdraw"); t2.setAmount(2000);
		atm.addTransaction(t2);

		Transaction t3 = new Transaction();
		t3.setTransactionId(3); t3.setType("Deposit"); t3.setAmount(3000);
		atm.addTransaction(t3);

		Transaction t4 = new Transaction();
		t4.setTransactionId(4); t4.setType("Withdraw"); t4.setAmount(4000);
		atm.addTransaction(t4);

		Transaction t5 = new Transaction();
		t5.setTransactionId(5); t5.setType("Deposit"); t5.setAmount(5000);
		atm.addTransaction(t5);

		Transaction t6 = new Transaction();
		t6.setTransactionId(6); t6.setType("Withdraw"); t6.setAmount(6000);
		atm.addTransaction(t6);

		Transaction t7 = new Transaction();
		t7.setTransactionId(7); t7.setType("Deposit"); t7.setAmount(7000);
		atm.addTransaction(t7);

		Transaction t8 = new Transaction();
		t8.setTransactionId(8); t8.setType("Withdraw"); t8.setAmount(8000);
		atm.addTransaction(t8);

		Transaction t9 = new Transaction();
		t9.setTransactionId(9); t9.setType("Deposit"); t9.setAmount(9000);
		atm.addTransaction(t9);

		Transaction t10 = new Transaction();
		t10.setTransactionId(10); t10.setType("Withdraw"); t10.setAmount(10000);
		atm.addTransaction(t10);

		Transaction t11 = new Transaction();
		t11.setTransactionId(11); t11.setType("Deposit"); t11.setAmount(11000);
		atm.addTransaction(t11);

		Transaction t12 = new Transaction();
		t12.setTransactionId(12); t12.setType("Withdraw"); t12.setAmount(12000);
		atm.addTransaction(t12);

		Transaction t13 = new Transaction();
		t13.setTransactionId(13); t13.setType("Deposit"); t13.setAmount(13000);
		atm.addTransaction(t13);

		Transaction t14 = new Transaction();
		t14.setTransactionId(14); t14.setType("Withdraw"); t14.setAmount(14000);
		atm.addTransaction(t14);

		Transaction t15 = new Transaction();
		t15.setTransactionId(15); t15.setType("Deposit"); t15.setAmount(15000);
		atm.addTransaction(t15);

		Transaction t16 = new Transaction();
		t16.setTransactionId(16); t16.setType("Withdraw"); t16.setAmount(16000);
		atm.addTransaction(t16);

		Transaction t17 = new Transaction();
		t17.setTransactionId(17); t17.setType("Deposit"); t17.setAmount(17000);
		atm.addTransaction(t17);

		Transaction t18 = new Transaction();
		t18.setTransactionId(18); t18.setType("Withdraw"); t18.setAmount(18000);
		atm.addTransaction(t18);

		Transaction t19 = new Transaction();
		t19.setTransactionId(19); t19.setType("Deposit"); t19.setAmount(19000);
		atm.addTransaction(t19);

		atm.getDetails();
	}
}