package lambdaExpdec16;

public class DemoLambdaExpression1MofIn {

	public static void main(String[] args) { 
		int v1=12;
		int v2=3;
		IArithmetic ob = (int x,int y)->
		{
			System.out.println("Sum:&"+(x+y));
			System.out.println("====Variable from Functional Interface====&");
			System.out.println("The valeu k:"+IArithmetic.k);
		};
		ob.calculate(v1, v2);//method Call
	}
}
