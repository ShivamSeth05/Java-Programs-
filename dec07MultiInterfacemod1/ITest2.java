package dec07MultiInterfacemod1;

public interface ITest2 {
	public abstract void m1(int x);
	public static void m2(int y) {
	System.out.println("====ITest2 m2(y)===");
	System.out.println("The value y:"+y);
	}
	public default void m33(int z) {
	System.out.println("=====ITest2 m33(z)====");
	System.out.println("The value z:"+z);
	}
}
