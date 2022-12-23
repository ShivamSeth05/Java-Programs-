package dec13AnonyousInnerInterface;

import java.util.Scanner;

public class DemoAnonymous2  {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2:");
		int v2 = s.nextInt();
		System.out.println("====Choice====");
		System.out.println(";1.GreaterValue\n2.SmallerValue&");
		System.out.println(";Enter the choice:&");
		switch(s.nextInt()) {
		case 1:
		//Anonymous InnerClass as implementation class
		IComparable gv = new IComparable()
		{
		public int compareTo(int x,int y) {
		if(x>y) return x;
		else return y;

		}
		};
		System.out.println(";GreaterValue:&"+gv.compareTo(v1, v2));
		break;
		case 2:
		//Anonymous InnerClass as implementation class
		IComparable sv = new IComparable()
		{
		public int compareTo(int x,int y) {
		if(x<y) return x;
		else return y;
		}
		};
		System.out.println(";SmallerValue:&"+sv.compareTo(v1, v2));
		break;
		default:
		System.out.println(";Invalid Choice....&");
		}//end of switch
		s.close();
	}

}
