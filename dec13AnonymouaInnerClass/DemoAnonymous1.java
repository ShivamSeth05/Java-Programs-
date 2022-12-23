package dec13AnonymouaInnerClass;

public class DemoAnonymous1 {

	public static void main(String[] args) {
		PClass ob = new PClass()
		{
			@Override
			public void m1(int x) {
				System.out.println("====CClass m1(x)====");
				System.out.println("The value x:"+x);
			}
			public void m3(int z) {// Genarlization
				System.out.println("====CClass m3(z)====");
				System.out.println("The value z:"+z);
			}
		};
		ob.m1(11);
		ob.m2(12);
		//ob.m3(13);  Error

	}

}
