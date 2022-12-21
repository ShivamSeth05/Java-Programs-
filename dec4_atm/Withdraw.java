package dec4_atm;

public class Withdraw implements Transaction {
	@Override
	public void proces(int amt){
		double cb=cob.bal;
		if(amt<cb) {
			cb=cb-amt;
			System.out.println(amt+"Rs Withdraw Succesfully!!");
			System.out.println("Current balance :"+cob.getBal(cb));	
			System.out.println("Transaction Succesfull!!");
		}else System.out.println("Insufficent Balance");

	}
}