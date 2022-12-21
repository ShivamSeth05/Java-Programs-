package dec4_interface_private;

public interface ITest {
	public abstract void m1(int x);
	private void dis1(int p) { // instant method
		System.out.println("==dis (p)==");
		System.out.println("The value p:"+p);
	}
	private static void dis2(int q) {
		System.out.println("==dis2 (q)==");
		System.out.println("The value q:"+q);
	}
	public default void access(int p,int q) {
		 this.dis1(p);
		ITest.dis2(q);
		 }
	

}
