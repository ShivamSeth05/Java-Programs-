package dec05_MultiInterface;

public class IClass implements ITest2 {

	@Override
	public void m1(int x) {
		// TODO Auto-generated method stub
		System.out.println("x:"+x);
	}

	@Override
	public void m2(int y) {
		// TODO Auto-generated method stub
		System.out.println("y:"+y);
	}

}
