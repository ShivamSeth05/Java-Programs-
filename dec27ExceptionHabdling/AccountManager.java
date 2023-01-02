package dec27ExceptionHabdling;

public class AccountManager extends Exception {
	AccountList al = new AccountList();
	public AccountManager(String msg) {
		super(msg);
	}
	public AccountManager() {

	}

	public boolean checkAccount(int accountNo){
		System.out.println(accountNo);
		System.out.println(al.ac.getAccountNumber());
		if(accountNo==al.ac.accountNumber)
			return true;
		return false;

	}
	public float deposit(int accountNo,double amount) throws AccountManager{
		if(amount<0)
		{
			throw new AccountManager("NegativeAmountException");
		}
		if(!(accountNo==al.ac.getAccountNumber()))
		{
			throw new AccountManager("InvalidAccountException");
		}
		return (float) (al.ac.balance+amount);

	}
	public float withdraw(int accountNo,double amount) throws AccountManager{
		if(amount<0)
		{
			throw new AccountManager("NegativeAmountException");
		}
		if(amount>al.ac.balance)
		{
			throw new AccountManager("InsufficientFundException");
		}
		if(!(accountNo==al.ac.accountNumber))
		{
			throw new AccountManager("InvalidAccountException");
		}
		return (float) (al.ac.balance-amount);

	}

}
