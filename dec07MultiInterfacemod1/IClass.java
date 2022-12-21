package dec07MultiInterfacemod1;

public class IClass implements ITest1,ITest2{

	@Override
	public void m1(int x) {
		
			System.out.println("====m1(x)====");
			System.out.println("The value x:"+x);
			
	}

}
