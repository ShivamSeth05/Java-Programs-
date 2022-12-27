package lambdaExpdec16;

import java.util.Arrays;
import java.util.Spliterator;

public class DemoLambdaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {11,12,13,14,15};
		 System.out.println("====Display using extendedfor====");
		 for(Integer k : a)
		 {
		 System.out.print(k.toString()+" ");
		 }//end of loop
		 System.out.println("\n====DisplaySpliterator<T>=====");
		 Spliterator<Integer> sp = Arrays.spliterator(a); 
		 sp.forEachRemaining((z)-> {
		 System.out.print(z.toString()+" ");
		 });
	}

}
