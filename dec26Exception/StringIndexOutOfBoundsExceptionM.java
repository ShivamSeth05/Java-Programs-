package dec26Exception;
class Exp3{
	public void testException(){
		try{
		String str="Follow World";
		System.out.println(str.length());
		char c =str.charAt(0);
		c=str.charAt(40);
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException s){
		s.printStackTrace();
		 }
		}

}
public class StringIndexOutOfBoundsExceptionM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp3  ob=new Exp3();
		ob.testException();

	}

}
