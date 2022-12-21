package dec4_interface_private;

public class IClass implements ITest {

	@Override
	public void m1(int x) {
		System.out.println("====m1(x)====");
		 System.out.println("The Value x :"+x);
	}

}
