package DemoLambdaExpression2;

import java.util.Scanner;

import dec13AnonyousInnerInterface.IComparable;

public class DemoLambdaExpression2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value-1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2:");
		int v2 = s.nextInt();
		System.out.println("====Choice====");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.println("Enter the choice:&");

		switch(s.nextInt()) {
		case 1:
			IComparable sv = (int x,int y)->

			{
				if(x>y) return x;
				else return y;
			};

			System.out.println("GreaterValue"+sv.compareTo(v1, v2));
			break;
					case 2:
					//LambdaExpression
					IComparable gv = (int x,int y)->
					{
					if(x<y) return x;
					else return y;
					};
					System.out.println("SmallerValue:"+gv.compareTo(v1, v2));
					break;
					default:
					System.out.println("Invalid Choice....");

		}//end of switch
		s.close();
	}
}
