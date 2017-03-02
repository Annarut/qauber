
public class BankAccount {
	
	private int AccountNumber;
	private boolean isActive;
	private double Balance;
	private String name;
	
	public BankAccount(int AccountNumber, String name, boolean isActive, double Balance ){
	this.AccountNumber = AccountNumber;
	this.isActive = isActive;
	this.Balance = Balance;
	this.name = name;
	}
	
	public String name(){
		return name;
	}
	
	public void deposit(double amount){
	Balance = Balance + amount;	
	}
    public void withraw(double amount){
	
	if(Balance - amount<500.0){
		Balance = Balance - amount;	
		
	}else{
		System.out.println("Insufficient balance in your account");
	}
    }
    public double getBalance(){
    	return Balance;
    
    	
    }
}
