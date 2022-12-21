package dec07MultiInterfacemod1;

public interface ITest1 {
	public abstract void m1(int x);
	public static void m2(int y) {
	System.out.println("====ITest1 m2(y)====");
	System.out.println("The value y:"+y);
	}
	public default void m3(int z) {
	System.out.println("=====ITest1 m3(z)====");
	System.out.println("The value z:"+z);
	}

}
