package dec26Exception;
class Exe{
	public void checkException(){
		try{
		int a[]=new int [50];
		a[6]=20;
		a[60]=45 ;//raise Ereor
		}
		catch (ArrayIndexOutOfBoundsException a){
		 a.printStackTrace();
		}
		}
}
public class Pro2ArrayIndexOutOfBoundsExceptionM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exe obExe=new Exe();
		obExe.checkException();
	}

}
