package dec26Exception;
class Exp{
	public void demo() {
		try{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}
public class NullPointerExceptionM {

	public static void main(String[] args) {
		Exp obExp = new Exp();
		obExp.demo();

	}

}
