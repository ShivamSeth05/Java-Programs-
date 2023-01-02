package dec26Exception;



class HandleNullPointerException{
	void display(String msg){
		System.out.println(msg);
	}
}
public class HandleNullPointerExceptionM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true) {
			HandleNullPointerException h=new HandleNullPointerException();;
			h.display("jh");
		}
		
		HandleNullPointerException h=null;
		h.display("shi");// ---Error
		//		HandleNullPointerException h= null;
//		if (h==null){
//			h= new HandleNullPointerException();
//			h.display("shian");
//		}
//				h.display("shi");
	}
}
