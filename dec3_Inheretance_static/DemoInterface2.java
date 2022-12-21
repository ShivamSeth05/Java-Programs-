package dec3_Inheretance_static;

public class DemoInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IClass obClass = new IClass();
		obClass.m1(5);
		ITest.m2(5);
//		IClass.m2(5); Error	
	}

}
