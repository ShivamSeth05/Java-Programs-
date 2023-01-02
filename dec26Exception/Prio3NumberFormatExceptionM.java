package dec26Exception;
class Exp2{
	public void myException(){
		try{
		int num=Integer.parseInt("365");
		System.out.println(num);
		int num1=Integer.parseInt("xyz");//Error
		
		}
		catch (NumberFormatException e){
		e.printStackTrace();
		 }
		}

}
public class Prio3NumberFormatExceptionM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp2 ob = new Exp2();
		ob.myException();
	}

}
