package dec07MultiInterfacemod1;

public class DemoMultipleInheritance1 {

	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(12);

		ITest1.m2(13);
		ITest2.m2(14);
		ob.m3(15);
		ob.m33(16);

	}

}
