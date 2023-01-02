package dec27ExceptionHabdling;

public class Account {
	Long accountNumber;
	Long balance;

	public Account() {
		
	}
	public Account(Long accountNumber, Long balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	


}
