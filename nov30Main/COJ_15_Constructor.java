package nov30Main;
import nov30.*;
public class COJ_15_Constructor {

	public static void main(String[] args) {

		COJ_15_TaxUtil ob = new COJ_15_TaxUtil();
		System.out.println(ob.calculateEmployeeTax());
		System.out.println(ob.calculateManagerTax());
		System.out.println(ob.calculateSourcingTax());
		System.out.println(ob.calculateTrainerTax());
		
	}

}
