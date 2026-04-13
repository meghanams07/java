class BankRunner{
	public static void main(String[] args){
		
		Bank bank = new Bank();

		BankAccount a1 = new BankAccount();
		a1.setAccountId(1); a1.setAccountHolder("Holder1"); a1.setBalance(1000);
		bank.addAccount(a1);

		BankAccount a2 = new BankAccount();
		a2.setAccountId(2); a2.setAccountHolder("Holder2"); a2.setBalance(2000);
		bank.addAccount(a2);

		BankAccount a3 = new BankAccount();
		a3.setAccountId(3); a3.setAccountHolder("Holder3"); a3.setBalance(3000);
		bank.addAccount(a3);

		BankAccount a4 = new BankAccount();
		a4.setAccountId(4); a4.setAccountHolder("Holder4"); a4.setBalance(4000);
		bank.addAccount(a4);

		BankAccount a5 = new BankAccount();
		a5.setAccountId(5); a5.setAccountHolder("Holder5"); a5.setBalance(5000);
		bank.addAccount(a5);

		BankAccount a6 = new BankAccount();
		a6.setAccountId(6); a6.setAccountHolder("Holder6"); a6.setBalance(6000);
		bank.addAccount(a6);

		BankAccount a7 = new BankAccount();
		a7.setAccountId(7); a7.setAccountHolder("Holder7"); a7.setBalance(7000);
		bank.addAccount(a7);

		BankAccount a8 = new BankAccount();
		a8.setAccountId(8); a8.setAccountHolder("Holder8"); a8.setBalance(8000);
		bank.addAccount(a8);

		BankAccount a9 = new BankAccount();
		a9.setAccountId(9); a9.setAccountHolder("Holder9"); a9.setBalance(9000);
		bank.addAccount(a9);

		BankAccount a10 = new BankAccount();
		a10.setAccountId(10); a10.setAccountHolder("Holder10"); a10.setBalance(10000);
		bank.addAccount(a10);

		BankAccount a11 = new BankAccount();
		a11.setAccountId(11); a11.setAccountHolder("Holder11"); a11.setBalance(11000);
		bank.addAccount(a11);

		BankAccount a12 = new BankAccount();
		a12.setAccountId(12); a12.setAccountHolder("Holder12"); a12.setBalance(12000);
		bank.addAccount(a12);

		BankAccount a13 = new BankAccount();
		a13.setAccountId(13); a13.setAccountHolder("Holder13"); a13.setBalance(13000);
		bank.addAccount(a13);

		BankAccount a14 = new BankAccount();
		a14.setAccountId(14); a14.setAccountHolder("Holder14"); a14.setBalance(14000);
		bank.addAccount(a14);

		BankAccount a15 = new BankAccount();
		a15.setAccountId(15); a15.setAccountHolder("Holder15"); a15.setBalance(15000);
		bank.addAccount(a15);

		BankAccount a16 = new BankAccount();
		a16.setAccountId(16); a16.setAccountHolder("Holder16"); a16.setBalance(16000);
		bank.addAccount(a16);

		BankAccount a17 = new BankAccount();
		a17.setAccountId(17); a17.setAccountHolder("Holder17"); a17.setBalance(17000);
		bank.addAccount(a17);

		BankAccount a18 = new BankAccount();
		a18.setAccountId(18); a18.setAccountHolder("Holder18"); a18.setBalance(18000);
		bank.addAccount(a18);

		BankAccount a19 = new BankAccount();
		a19.setAccountId(19); a19.setAccountHolder("Holder19"); a19.setBalance(19000);
		bank.addAccount(a19);

		bank.getDetails();
	}
}