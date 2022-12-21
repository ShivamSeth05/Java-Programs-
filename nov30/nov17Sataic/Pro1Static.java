package nov17Sataic;

class StaticMethodDemo{
	static void displayStaticMessage() {
		System.out.println("I am Static Mehod");
	}
}
public class Pro1Static {
	public static void main(String[] args) {
		StaticMethodDemo.displayStaticMessage();//using class name
		StaticMethodDemo obDemo = new StaticMethodDemo();
		obDemo.displayStaticMessage();//using obj name
		StaticMethodDemo test=null;
		test.displayStaticMessage();// null refference
		}
	
	

}
