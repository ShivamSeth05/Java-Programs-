package dec4_atm;

public class Deposit implements Transaction {

	@Override
	public void proces(int amt) {
		double cb=cob.bal;
		cb=cb+amt;
		System.out.println("Amount Deposit : "+amt);
		System.out.println("Balance Amount  :"+cob.getBal(cb));
		System.out.println("Transaction Succesfull!!");
	}
}
