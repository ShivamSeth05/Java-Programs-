package dec3_Inheretance_static;

public interface ITest {
	public abstract void m1(int x); //abstract method
	public static void m2(int y) { //static concrete method 
		System.out.println("====Static concrete m2(y)====");
		System.out.println("The value y"+y);
	}
}









