package dec20DemoException;

public class DemoException3 {

	public static void main(String[] args) 
	throws ClassNotFoundException,InstantiationException,IllegalAccessException{
		Class c = Class.forName("dec20DemoException.Display");
		Object ob = (Object)c.newInstance();
		System.out.println(ob.toString());

	}

}
