package dec20DemoException;

public class Display {
	public void dis(int x) {
		System.out.println("====dis(x)====");
		System.out.println("The value x:"+x);
	}
	public String toString() {
		this.dis(123);
		return "";
	}
}