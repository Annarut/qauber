
public class TestBankAccount {
	
	public static void main(String[] args){
		BankAccount account1 = new BankAccount(1, "account1", true, 100.0);
		BankAccount account2 = new BankAccount(2, "account2", true, 200.0);
		BankAccount account3 = new BankAccount(3, "account3", true, 300.0);
		BankAccount account4 = new BankAccount(4, "account4", true, 400.0);
		BankAccount account5 = new BankAccount(5, "account5", true, 500.0);
		BankAccount account6 = new BankAccount(6, "account6", true, 600.0);
		BankAccount account7 = new BankAccount(7, "account7", true, 700.0);
		BankAccount account8 = new BankAccount(8, "account8", true, 800.0);
		BankAccount account9 = new BankAccount(9, "account9", true, 900.0);
		BankAccount account10 = new BankAccount(10, "account10", true, 1000.0);
		
		BankAccount[] accounts = {account1, account2, account3, account4, account5, account6, account7, account8, account9, account10};
		
		for(int i=0;i<accounts.length;i++){
			System.out.println(accounts[i].name());
			System.out.println(accounts[i].getBalance());
			
			
			
			
		}
		
		







	}

}
